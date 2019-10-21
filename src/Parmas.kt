fun main(args: Array<String>) {
    println(getCircleArea(3.1, 3.0f))
    println(getCircleArea(width = 3.0f))
}

fun getSquareArea(long: Int, width: Int): Int {
    return long * width
}

fun getCircleArea(pi: Double = 3.14, width: Float): Double {
    return 2 * pi * width
}
