package ascii

fun main(args: Array<String>) {
    var c: Char = 'a'
    val toBinaryString = Integer.toBinaryString(c.toInt())
    println(toBinaryString)
}