package net.aperiodic

import scala.annotation.tailrec
import scala.util.Try

/**
 * Created by insford on 16. 8. 22..
 *
 * P01 (*) Find the last element of a list.
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 */
object P01 extends App {
/*
P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
 */

  def last[A](list: List[A]): A = list match {
    case h :: Nil => h
    case h :: t => last(t)
    case _ => throw new NoSuchElementException
  }

  println(last(List(1, 1, 2, 3, 5, 8)))
  println(Try(last(Nil)).toString)
}
