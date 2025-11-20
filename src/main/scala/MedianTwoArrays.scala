object MedianTwoArrays {
  def main(args: Array[String]): Unit = {
    println(median(List(1,3), List(2)))
    println(median(List(1,2), List(3,4)))
    println(median(List(0,0), List(0,0)))
    println(median(List(), List(1)))
    println(median(List(2), List()))
  }

  private def median(nums1: List[Int], nums2: List[Int]): Double = {
    val mergedNums = nums1.concat(nums2).sorted

    if (mergedNums.length == 1) {
      return mergedNums.head
    }

    val value = mergedNums.head + (mergedNums.last - mergedNums.head)

    if (value == 0) {
      return 0.0
    }

    val midIndex = value / 2

    if (mergedNums.length % 2 == 0) {
      val upperLength = midIndex - 1
      (mergedNums(upperLength) + mergedNums(midIndex)) / 2.0
    }
    else {
      mergedNums(midIndex)
    }
  }
}
