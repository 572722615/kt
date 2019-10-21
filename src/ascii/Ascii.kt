package ascii

fun main(args: Array<String>) {
    val c: Char = 'A'
    val value: Int = c.toInt()
    println(value)

    val str = "hello world"
//    val stringBuilder = StringBuilder()
    val toCharArray = str.toCharArray()


    val result = with(StringBuilder()) {
        for (t in toCharArray) {
            append(t.toInt().toString() + " ")
//        println(t.toInt())
        }
        toString()
    }
    println(result)
}