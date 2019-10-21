fun main(args: Array<String>) {
    var num = 123
    var str = "123"
//    println(num.toString() == str)
//    println(num == str.toInt())

    try {
        1/0
    } catch (e: Exception) {
        print(e)
    }
    var num2 = readLine()
    print(num::class)
}