package com.aps.dataStructures.scala.array

object ArraySearch {

  def search(array: Array[Int], item: Int): Int = {
    array.foreach(x => if(x == item) return array.indexOf(x))
    -1
  }


  def main(args: Array[String]): Unit ={
    val array: Array[Int] = Array(1, 2, 3, 4, 5, 6)
    val item = 6

    println(s"Index of $item in array ${array.mkString("Array(", ", ", ")")} is : " + search(array, item))
  }

}
