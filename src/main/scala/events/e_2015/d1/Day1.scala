package events.e_2015.d1

import events.Challenge

import scala.io.BufferedSource
import scala.io.Source.fromFile
import scala.util.control.Breaks.{break, breakable}

class Day1 extends Challenge {
  private val data: BufferedSource = fromFile("src/main/scala/events/e_2015/d1/input.txt")
  private var floors: List[Int] = data.mkString.map {
    case '(' => 1
    case ')' => -1
  }.toList
  private var floor = 0
  private var index: Option[Int] = None

  private def task1: Int = floors.sum

  private def task2: Int = {
    breakable {
      for ((x, y) <- floors.zipWithIndex) {
        floor += x
        if (floor == -1) {
          index = Some(y + 1)
          break
        }
      }
    }
    index.get
  }

  override def solve(): String =
    s"Task 1: $task1\tTask2: $task2"


}
