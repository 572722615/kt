package num

fun main(args: Array<String>): Unit {
//    echo()
//    func()

//    onlyif(true) {
//        print("debug")
//        return@onlyif 1
//    }

    val runnable = Runnable {
        print("run")
    }

    val func:()->Unit

    func = runnable::run

    onlyif(true,func)
}

fun echo(name: String = "xiaoming") {
    print(name)
}

fun echo() = print("xiaoming2")

fun func(str: String = "xiaoming3") {

    fun say() {
        print(str)
    }
    say()
}

class Func {

}


inline fun onlyif(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block()
}

