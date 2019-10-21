sealed class childs {
    class male() : childs()
    class female() : childs()

    fun say() {
        println("hhh")
    }
}

fun main(args: Array<String>) {
    var s: childs = childs.female()
    s.say()
}
