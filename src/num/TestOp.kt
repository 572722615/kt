package num

fun main(args: Array<String>) {
    val user: User = User(11, "xiaoming")
    val (age) = user
    println(age)

    val map = mapOf<String, String>("1" to "a", "2" to "b")
    for ((k, v) in map){
        println(k+v)
    }
}