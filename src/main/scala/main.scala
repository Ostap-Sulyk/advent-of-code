import events.e_2015.*

@main
def main(): Unit = {
  val days = List(
    new Day1,
    new Day2,
    new Day3,
    new Day4,
  )

  days.foreach(day => println(day.getAnswer))
}