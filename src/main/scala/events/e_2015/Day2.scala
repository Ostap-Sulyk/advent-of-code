package events.e_2015

import events.printNicely
import events.Challenge

import scala.io.Source.fromFile


class Day2 extends Challenge {
  private class Box(val l: Int, val w: Int, val h: Int) {
    def surfaceArea: Int = (2 * l * w) + (2 * w * h) + (2 * h * l)

    def smallestSide: Int = List(l * w, w * h, h * l).min

    def ribbon: Int = List(2 * l + 2 * w, 2 * w + 2 * h, 2 * h + 2 * l).min + l * w * h

  }

  private def parseLineToBox(line: String): Box = {
    val dims = line.split("x").map(_.toInt)
    new Box(dims(0), dims(1), dims(2))
  }

  private val data = fromFile("src/main/scala/events/e_2015/inputs/day2.txt")
  private val dataAsList: List[Box] = data.getLines().map(parseLineToBox).toList

  private def task1: Int = dataAsList.map(x => x.surfaceArea + x.smallestSide).sum

  private def task2: Int = dataAsList.map(x => x.ribbon).sum

  def getAnswer: String = printNicely(this.getClass.getSimpleName, task1, task2)

}
