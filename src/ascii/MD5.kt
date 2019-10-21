package ascii

import java.security.MessageDigest
import kotlin.experimental.and

fun main(args: Array<String>) {
    val input = "xiaoming"
    val digest = MessageDigest.getInstance("MD5")
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