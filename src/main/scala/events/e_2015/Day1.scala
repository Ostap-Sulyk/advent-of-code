package events.e_2015

import events.{Challenge, printNicely}

import scala.io.BufferedSource
import scala.io.Source.fromFile

class Day1 extends Challenge {
  private val data: BufferedSource = fromFile("src/main/scala/events/e_2015/inputs/day1.txt")
  private var floor = 0
  private var index: Option[Int] = None

  private val floors: List[Int] = data.mkString.map {
    case '(' => 1
    case ')' => -1
  }.toList

  private def task1: Int = floors.sum

  private def task2: Int = {
    for (i <- floors.indices) {
      floor += floors(i)
      if (index.isEmpty) {
        if (floor == -1) index = Some(i + 1)
      }
    }
    index.get
  }
  def getAnswer: String = printNicely(this.getClass.getSimpleName, task1, task2)


}
