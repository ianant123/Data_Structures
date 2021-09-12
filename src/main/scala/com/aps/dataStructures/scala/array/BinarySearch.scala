package com.aps.dataStructures.scala.array

object BinarySearch {

  def binarySearch(array: Array[Int],
                   item: Int,
                   low: Int,
                   high: Int): Int = {
    if( low > high)
      return -1
    val mid = (low + high)/2
    if (array(mid) == item)
      mid
    else if (array(mid) > item)
      binarySearch(array, item, low, mid - 1)
    else
      binarySearch(array, item, mid + 1, high)

  }

  def main(args: Array[String]): Unit ={
    val array: Array[Int] = Array(1, 2, 3, 4, 5, 6)
    val item = 6
    println(s"Index of $item in array ${array.mkString("Array(", ", ", ")")} is : " + binarySearch(array, item, 0, array.length - 1))
  }

}
