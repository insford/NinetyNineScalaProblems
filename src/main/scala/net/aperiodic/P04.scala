package net.aperiodic

import scala.annotation.tailrec
import scala.util.Try

/**
 * Created by insford on 16. 8. 27..
 */
object P04 extends App {
/*
P04 (*) Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
 */

  def length[A](list: List[A]): Int = {
    @tailrec
    def loop[B](size: Int, l: List[B]): Int = l match {
      case Nil => size
      case _ => loop(size + 1, l.tail)
    }
    loop(0, list)
  }

  println(length(List(1, 1, 2, 3, 5, 8)))
  println(Try(length(Nil)))
}
