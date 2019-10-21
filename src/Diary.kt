fun main(args: Array<String>) {
    println(diary("11111"))
}

fun diary(name: String): String {
    var temp = """

        aaaaaaaa

        ${name}+${name.length}

    """
    return temp
}