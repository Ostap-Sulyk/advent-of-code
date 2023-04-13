package events.e_2015

import scala.io.Source.fromFile

private class Box(val l: Int, val w: Int, val h: Int) {
  def surfaceArea: Int = (2 * l * w) + (2 * w * h) + (2 * h * l)

  def smallestSide: Int = List(l * w, w * h, h * l).min

  override def toString: String = s"Box($l, $w, $h)"
}

def parseLineToBox(line: String): Box = {
  val dims = line.split("x").map(_.toInt)
  new Box(dims(0), dims(1), dims(2))
}

object Day2 extends App {
  val data = fromFile("src/main/scala/events/e_2015/inputs/day2.txt")
  val dataAsList: List[Box] = data.getLines().map(parseLineToBox).toList


  def task1: Int = dataAsList.map(x => x.surfaceArea + x.smallestSide).sum


}
