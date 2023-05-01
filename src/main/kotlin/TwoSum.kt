
fun main(args: Array<String>) {
    println("Задача из leetcode.com на вычисление двух элементов массива, сумма которых равна заданному target")
    val nums = arrayOf(1,3,5,7,9,11,15)
        val solution = Solution()
        val target = 20
    println(nums.toList())
    println("Target = $target")
        println(solution.twoSum (nums, target).asList())
    val check = true
    if (!check) {
        println(check)
    }
}


class Solution() {
    fun twoSum(nums: Array<Int>, target: Int) : Array<Int> {
        val resultArrray: Array<Int> = arrayOf(0,0)
        val mutableList: MutableList <String> = mutableListOf()

        for (i in 1..nums.size - 1) {
            if ((nums[i] + nums[i - 1]) == target) {
                resultArrray[0] = i - 1
                resultArrray[1] = i
            }
        }
        return resultArrray
    }
    }