package num

fun main(args: Array<String>) {

    inFunc {
        println("1")
        return@inFunc
    }
    println("2")

}

inline fun inFunc(noinline l: () -> Unit) {
    l.invoke()
    return
}