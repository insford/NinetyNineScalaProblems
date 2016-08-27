package net.aperiodic

import scala.annotation.tailrec
import scala.util.Try

/**
 * Created by insford on 16. 8. 27..
 */
object P05 extends App {
/*
P05 (*) Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */

  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def loop[B](r: List[B], l: List[B]): List[B] = l match {
      case h :: t => loop(h :: r, t)
      case _ => r
    }
    loop(Nil, list)
  }

  def reverse2[A](list: List[A]): List[A] =
//    list.foldLeft(List[A]())((a, b) => b :: a)
    (List[A]() /: list)((a, b) => b :: a)

  println(reverse(List(1, 1, 2, 3, 5, 8)))
  println(Try(reverse(Nil)))

  println(reverse2(List(1, 1, 2, 3, 5, 8)))
  println(Try(reverse2(Nil)))

}
