package events.e_2015

object Starting extends App{
  val list = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
  println(list.foldLeft("")((acc, x) => {
    acc + x
  }))

}
