package num

fun main(args: Array<String>) {
//    for(i in 1..10){
//        println(i)
//    }

//    for (i in 1 until 10){
//        println(i)
//    }

//    for (i in 10 downTo 1) {
//        println(i)
//    }

//    repeat(10){
//        println(it)
//    }

//    for (i in 10..1){
//        println(i)
//    }

    var list = arrayListOf<String>("a", "b", "c")
    for ((index, str) in list.withIndex()) {
        println("${index}+${str}")
    }
}