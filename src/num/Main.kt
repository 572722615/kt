package num

const val a = 0

class Main {

}

fun main(args: Array<String>) {
    println("h")
    println(Account().str)
    var haha = Account()
    haha.str = "haha"
    println(haha.str)
    Account().test(null)

}

class Account {
    var str: String? = null
        get() {
            return field + "123"
        }
        set(value) {
            field = value + "set"
        }

    val str2: String? = null
        get() {
            return field + "aaa"
        }

    fun test(str: String?) {
        println(str)
    }

}