package num

import java.io.File

fun main(args: Array<String>) {
    val ktstr = "123"
    val jstr = StringBuilder("123").toString()
    println(ktstr == jstr)
    println(ktstr.equals(jstr))
    println(ktstr === jstr)
    var file = A(".","a.txt")

}

typealias A = File