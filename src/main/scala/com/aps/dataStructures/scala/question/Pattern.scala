package com.aps.dataStructures.scala.question

import scala.io.StdIn.readInt

object Pattern extends App {

//  println("Input the number for star pattern : ")
//  val rows: Int = readInt()
//  firstPattern(rows)

  //  ********
  //  *******
  //  ******
  //  *****
  //  ****
  //  ***
  //  **
  //  *
  def firstPattern(rows: Int): Unit = {
    var i: Int = rows
    var j: Int = 0
    while(i > 0){
      j = 1
      while(j <= i){
        print("*")
        j += 1
      }
      println()
      i -= 1
    }
  }

  val tempArray: Array[Int] = Array(3,1,10,1,20, 10)
  scala.util.Sorting.quickSort(tempArray)
  println(tempArray.mkString("Array(", ", ", ")"))




}
