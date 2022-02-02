package com.aps.dataStructures.scala.array.sorting

object MergeSort {

  def merge(arr: Array[Int], l: Int, m: Int, r: Int): Unit = {
    var i = l
    var j = m + 1
    var k = l
//    System.out.println(s"merge:  l: $l, m: $m, r: $r")
//    System.out.println("merge : " + arr.mkString(", "))
    val temp = new Array[Int](r+1)
    while(i<=m && j<=r) {
      if (arr(i) < arr(j)) {
        temp(k) = arr(i)
        i = i + 1
      }
      else{
        temp(k) = arr(j)
        j = j + 1
      }
      k = k + 1
    }

    while(i<=m){
      temp(k) = arr(i)
      k = k + 1
      i = i + 1
    }
    while(j<=r){
      temp(k) = arr(j)
      k = k + 1
      j = j + 1
    }

    i = l
    while(i<=r){
      arr(i) = temp(i)
      i = i + 1
    }
//    System.out.println( "merge : " +arr.mkString(", "))
  }

  def mergeSort(arr: Array[Int], l: Int, r: Int): Unit = {
    if (l < r) {
      val m = (l+r) / 2
//      System.out.println(s"mergeSort:  l: $l, m: $m, r: $r")
      mergeSort(arr, l, m)
      mergeSort(arr, m + 1, r)
      merge(arr, l, m, r)
//      System.out.println(arr.mkString(", "))
    }
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(10, 80, 60, 40, 90, 12)
//    val arr = Array(10, 80)
    val r = arr.length - 1
    val l = 0
//    System.out.println("m " + m)
//    System.out.println("r " + r)
    mergeSort(arr, l, r)
    System.out.println(arr.mkString(", "))
    System.out.println("printing the array")
//    System.out.println(arr[i] + ",");

  }

}
