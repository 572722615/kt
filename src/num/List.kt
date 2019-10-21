package num

fun main(args: Array<String>) {
    var list = arrayListOf<Char>('a', 'b', 'c')
    var a = list.map {
        it - 'a'
    }.filter {
        it > 0
    }.find {
        it > 1
    }

    list.filter {
        (it - 'a') > 0
    }.map {
//        list[it]
    }
    println(a)
}