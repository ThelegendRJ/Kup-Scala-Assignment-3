package edu.knoldus


class Tree {
  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree        => false
    case Node(bit, left, right) => if (bit < v) contains(left, v)
                                    else if (bit > v) contains(right, v)
                                    else true
  }


  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(bit, left, right) =>
            if (bit < v) Node(bit, insert(left, v), right)
            else if (bit > v) Node(bit, left, insert(right, v))
            else t
  }
}
