package events

import java.util.Formatter

def paint(x: Int): String = s"\u001b[32m$x\u001b[0m"

def printNicely(name: String, a1: Int, a2: Int): String = {
  val task1 = s"Task 1: ${paint(a1)}"
  val task2 = s"Task 2: ${paint(a2)}"
  val spacer = " " * 10
  val colWidth = 40
  s"$name$spacer$task1${" " * (colWidth - task1.length)}$task2"
}
