fun main(args: Array<String>) {
    var nums = 1 until 10
    var res = 0;
    for (num in nums.reversed() step 1) {
//        print(num.toString()+",")
        println(num)
        res = res + num
    }
    print(res)


}