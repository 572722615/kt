import java.util.*

fun main(args: Array<String>) {
    var map = TreeMap<String, String>()

    map.put("1", "a")
    map.put("2", "b")
    map.put("3", "c")

    println(map.get("2"))
}