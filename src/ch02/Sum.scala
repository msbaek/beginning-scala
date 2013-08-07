package ch02

import scala.io._

class Sum {
  def toInt(in: String): Option[Int] = // Option: a container that holds one or zero things
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }

  def sum(in: Seq[String]) = {
    val ints = in.flatMap(s => toInt(s))
    ints.foldLeft(0)((a, b) => a + b)
  }

  def main(args: Array[String]) = {
    println("Enter some numbers and press ctrl-D")

    val input = Source.fromInputStream(System.in)

    val lines = input.getLines().toSeq

    println("Sum: " + sum(lines))
  }
}
