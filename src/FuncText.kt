fun main(args: Array<String>) {
    var names = listOf<String>("tom", "peter", "marrya")
//    names.forEach(printName)
//    names.forEach { a-> println(a) }
//    println(names.minBy {
//        it.length
//    })
//    println(names.maxBy {
//        it.length
//    })
//    println(names.filter {
//        it.startsWith("pe") and (it.length > 1)
//    })
//    println(names.map{
//        "${it }: ${it.length}"
//    })
//    println(names.any {
//        it.length == 3
//    })
//    println(names.count {
//        it.length == 3
//    })
//    names.groupBy { it.length }.get(3)?.forEach { println(it) }
//    names find (6)
//    names find 4
//    println(1 vs2 2)
    `var`()
}

var printName = fun(name: String): Unit {
    println(name)
}

infix fun List<String>.find(len: Int) {
    filter {
        it.length < len
    }.forEach(printName)
}

infix fun Int.vs(num: Int): String =
        if (this < num) {
            "less"
        } else {
            "more"
        }


infix fun Int.vs2(num: Int): String {
    return "less"
}

fun `var`(){
    print("var")
}

