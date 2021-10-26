package edu.knoldus

class Sets{

  def Union(group1:Set[Int], group2:Set[Int]) ={
    group1 ++ group2
  }
  def Intersection(group1:Set[Int], group2:Set[Int]) = {
    group1 & group2
  }
}