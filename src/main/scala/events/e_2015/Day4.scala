package events.e_2015

import events.{Challenge, printNicely}

import java.security.MessageDigest
import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.*

class Day4 extends Challenge{
  val md = MessageDigest.getInstance("MD5")
  val secretKey = "iwrupvqb"
  val prefix1 = "0" * 5
  val prefix2 = "0" * 6

  def hash(input: String): String = {
    md.reset()
    md.update(input.getBytes("UTF-8"))
    md.digest().map("%02x".format(_)).mkString
  }

  def task1: Int = LazyList.from(1).find(i => hash(secretKey + i).startsWith(prefix1)).get

  def task2: Int = LazyList.from(1).find(i => hash(secretKey + i).startsWith(prefix2)).get

  def getAnswer: String = printNicely(this.getClass.getSimpleName, task1, task2)
}

