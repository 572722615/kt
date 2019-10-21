fun main(args: Array<String>) {
    var lists = listOf<String>("1", "2", "aaa")
    println(lists)
    for (list in lists) {
        println(list)
    }

    for ((i, v) in lists.withIndex()) {
        println("$i+$v ")

    }
}