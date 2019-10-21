fun main(args: Array<String>) {
    var res = 0
    println(recall(100, res))
}

tailrec fun recall(i: Int, result: Int): Int {
    if (i == 0) {
        return result
    } else {
        return recall(i - 1, result + i)
    }
}
