package num


fun main(args: Array<String>) {
    format(null)
}

fun format(string: String?) {
//    string.isEmpty()?null:string
    println(string?.length)
}