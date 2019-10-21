package num

fun main(args: Array<String>) {
//    Thread(){
//        ->Unit
//    }.start()
//    echo.invoke("lala")
//    echo("haha")
    val user = User(1, "hehe")
//    println(user.let {
//        "{${user.javaClass}}"
//    })
//    println(user.run {
//        this.javaClass
//    })
//    user.apply { print(this) }
    println(user.takeIf { user -> user.age > 10 })
    println(user.takeUnless { user -> user.age > 10 })

}

val echo = { name: String ->
    println(name)
}

