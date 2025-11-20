object TwoSum {
  def main(args: Array[String]): Unit = {
    println(getNumbersForTarget(Array(2,7,11,15), 9).toList)
    println(getNumbersForTarget(Array(3,2,4), 6).toList)
    println(getNumbersForTarget(Array(3,3), 6).toList)
  }

  private def getNumbersForTarget(nums: Array[Int], target: Int): Array[Int] = {
    var indices: Array[Int] = Array()

    for (index <- nums.indices) {
      val result = target - nums(index)

      if (nums.contains(result) && nums.indexOf(result) != index) {
        indices = Array(nums.indexOf(result), index)
      }
    }

    indices
  }
}
