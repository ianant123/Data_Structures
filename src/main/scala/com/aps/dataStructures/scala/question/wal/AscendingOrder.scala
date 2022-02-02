package com.aps.dataStructures.scala.question.wal

object AscendingOrder extends App {
  val intervals: Array[(Int, Int)] = Array((2,6),(3,4),(8,10),(15,18),(1,3))
  println(merge(intervals).mkString("Array(", ", ", ")"))
//  Output: [[1,6],[8,10],[15,18]]
//  Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

  def merge(intervals: Array[(Int, Int)]): Array[(Int, Int)] = {
    val size = intervals.length
    if (size <= 1)
      return intervals

//    val list = intervals.toList
//    list.sort
    println(intervals.mkString("Array(", ", ", ")"))
    val sortedInterval: Array[(Int, Int)] = intervals.sortBy(_._1)
    println(sortedInterval.mkString("Array(", ", ", ")"))

//    ((firstElement:(Int, Interger), secondElement:(Int, Int)): Boolean = if(firstElement._1 < = secondElement._1) true else false)


    var a = sortedInterval(0)._1
    var b = sortedInterval(0)._2
    var i = 1
    var outputList: List[(Int, Int)] = List()

    while(i < size){

      if(sortedInterval(i)._1 > b){
        outputList = outputList ++ List((a, b))
        a = sortedInterval(i)._1
        b = sortedInterval(i)._2
      }
      else{
        if (b < sortedInterval(i)._2)
          b = sortedInterval(i)._2

      }
      i = i + 1
    }
    outputList = outputList ++ List((a, b))

    outputList.toArray
  }



}
