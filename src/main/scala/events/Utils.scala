package events

import java.util.Formatter

def paint(x: Int): String = s"\u001b[32m$x\u001b[0m"

def printNicely(name: String, a1: Int, a2: Int): String = s"$name\tTask 1: ${paint(a1)}\t\tTask 2: ${paint(a2)}"