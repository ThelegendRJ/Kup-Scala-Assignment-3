package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class SetTest extends AnyFunSuite{
  test("Is the Set empty or not") {
    val obj = new Sets
    assert(Set.empty.isEmpty)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
  test("Union is working or not"){
    val obj = new Sets
    val temp =obj.Union(group1 = Set(1,3,5,7), group2 = Set(2,4,6,8,1,5))
    val a :Set[Int] = Set(1,3,5,7)
    val b :Set[Int] = Set(2,4,6,8,1,5)
    assert(if (temp == a.union(b)){
      true
    }
    else false)
  }
  test("Intersection is working or not"){
    val obj = new Sets
    val temp =obj.Intersection(group1 = Set(1,3,5,7), group2 = Set(2,4,6,8,1,5))
    val a :Set[Int] = Set(1,3,5,7)
    val b :Set[Int] = Set(2,4,6,8,1,5)
    assert(if (temp == a.intersect(b)){
      true
    }
    else false)
  }

}
