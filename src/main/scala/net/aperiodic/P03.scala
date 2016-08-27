package net.aperiodic

import scala.annotation.tailrec
import scala.util.Try

/**
 * Created by insford on 16. 8. 27..
 */
object P03 extends App {
/*
P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
 */
  @tailrec
  def nth[A](n: Int, list: List[A]): A =
    if (n > 0) nth(n - 1, list.tail)
    else list.head

  println(nth(2, List(1, 1, 2, 3, 5, 8)))
  println(nth(0, List(1, 9, 2, 3, 5, 8)))

  println(Try(nth(0, Nil)))
}
