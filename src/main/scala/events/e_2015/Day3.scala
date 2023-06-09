package events.e_2015

import events.{Challenge, printNicely}

import scala.io.Source.fromFile

class Day3 extends Challenge {
  private val dataFromFile = fromFile("src/main/scala/events/e_2015/inputs/day3.txt")
  private val input = dataFromFile.mkString
  private type Coord = (Int, Int)

  private def move(c: Char, coord: Coord): Coord = c match {
    case '^' => (coord._1, coord._2 + 1)
    case 'v' => (coord._1, coord._2 - 1)
    case '>' => (coord._1 + 1, coord._2)
    case '<' => (coord._1 - 1, coord._2)
  }

  private def task1: Int = {
    input.foldLeft((Set((0, 0)), (0, 0))) { (acc, c) =>
      val newPos = move(c, acc._2)
      (acc._1 + newPos, newPos)
    }._1.size
  }

  private def task2: Int = {
    input.zipWithIndex.foldLeft((Set((0, 0)), (0, 0), (0, 0))) { (acc, ci) =>
      val (c, i) = ci
      if (i % 2 == 0)
        val newPos = move(c, acc._2)
        (acc._1 + newPos, newPos, acc._3)
      else
        val newPos = move(c, acc._3)
        (acc._1 + newPos, acc._2, newPos)

    }._1.size
  }

  def getAnswer: String = printNicely(this.getClass.getSimpleName, task1, task2)
}
