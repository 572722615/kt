package ascii

import java.security.MessageDigest

fun main(args: Array<String>) {
    val input = "xiaoming"
//    val digest = MessageDigest.getInstance("SHA-1")
    val digest = MessageDigest.getInstance("SHA-256")
    val result = digest.digest(input.toByteArray())

    with(StringBuilder()) {
        result.forEach {
            val hex = it.toInt() and 0xff
            val str = Integer.toHexString(hex)
            if (str.length == 1) {
                append("0").append(str)
            } else {
                append(str)
            }
        }
        println(this)
    }
}