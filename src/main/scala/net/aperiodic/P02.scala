package net.aperiodic

import scala.annotation.tailrec
import scala.util.Try

/**
 * Created by insford on 16. 8. 27..
 */
object P02 extends App {
/*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */

  def penultimate[A](list: List[A]): A = list match {
    case h2 :: h1 :: Nil => h2
    case h2 :: h1 :: t => penultimate(list.tail)
    case _ => throw new NoSuchElementException
  }

  println(penultimate(List(1, 1, 2, 3, 5, 8)))
  println(penultimate(List(1, 1, 2, 3)))

  println(Try(penultimate(List(8))).toString)
  println(Try(penultimate(Nil)).toString)
}
