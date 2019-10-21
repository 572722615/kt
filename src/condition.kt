fun main(args: Array<String>) {
//    check(10)
    var a = "a"
    var b = "A"
    print(a.equals(b, true))
}

fun check(score: Int) {
    if (score > 0) {
        print("+")
    } else {
        print("-")
    }
}