fun main(args: Array<String>) {
//    println(plus(1, 2))
    println(plus2(1, 2))

    var res = { x: Int, y: Int -> x + y }
    println(res(3, 6))
    
    var res2: (Int, Int) -> Int = { x, y -> x + y }
    println(res2(1,5))

}

fun plus(a: Int, b: Int): Int {
    return a + b
}

fun plus2(a: Int, b: Int): Int = a + b

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mutl(a: Int, b: Int): Int {
    return a * b
}

fun devide(a: Int, b: Int): Int {
    return a / b
}
