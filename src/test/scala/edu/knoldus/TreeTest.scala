package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class TreeTest extends AnyFlatSpec {

    val obj = new Tree
    val temp = obj.Node(2, obj.Node(1, obj.Node(7, obj.EmptyTree, obj.EmptyTree),
      obj.EmptyTree), obj.Node(4, obj.EmptyTree, obj.Node(6, obj.EmptyTree, obj.EmptyTree)))
  "check tree" should "contains an element 2" in {
    assert(obj.contains(temp, 2))
  }

  "check tree" should "contains an element 7" in {
    assert(obj.contains(temp, 7))
  }

}
