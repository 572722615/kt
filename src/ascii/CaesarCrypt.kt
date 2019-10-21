package ascii

fun main(args: Array<String>) {
//    val c = 'A'
//    var ascii = c.toInt()
//    ascii += 1
//    val result = ascii.toChar()
//    println(result)
//    val command = "hello world"

    CaesarCrypt().encrypt("abc", 2)
    CaesarCrypt().decrypt("cde  ", 2)

}

class CaesarCrypt {
    fun encrypt(command: String, key: Int) {
//        var charCommand = command.toCharArray()
//        var resStr = StringBuilder()
//        charCommand.forEach {
//            var ascii = it.toInt()
//            ascii += key
//            var result = ascii.toChar()
//            resStr.append(result)
//        }
//        println(resStr)

        with(StringBuilder()) {
            var charCommand = command.toCharArray()
            charCommand.forEach {
                var ascii = it.toInt()
                ascii += key
                var result = ascii.toChar()
                append(result)
            }
            println(toString())
        }
    }

    fun decrypt(command: String, key: Int) {
        with(StringBuilder()) {
            var charCommand = command.toCharArray()
            charCommand.forEach {
                var ascii = it.toInt()
                ascii -= key
                var result = ascii.toChar()
                append(result)
            }
            println(toString())
        }
    }
}