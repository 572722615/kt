class Rect(var height: Int, var width: Int)

open class Father() {
    open var chactor: String = "外向"
    open fun act() {
        println("fffffff")
    }
}

class son : Father() {
    override var chactor: String = "aaa"
    override fun act() {
        println("sss")
    }
}

abstract class Human() {
    abstract fun eat()

    abstract fun pee()
}

class man : Human() {
    override fun pee() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun eat() {
        print("man")
    }

}

interface IMan {
    fun eat()
    fun walk()
}

class person : Human(), IMan {
    override fun pee() {

    }

    override fun eat() {
        println("eee")
    }

    override fun walk() {
        println("wwwwww")
    }

}

interface IWash {
    fun wash()
}

//single
object child : IWash {
    override fun wash() {
        println("wash……")
    }
}

class midChild : IWash by child{
    override fun wash() {
        println("hahaha")
        child.wash()
    }
}

fun main(args: Array<String>) {
//    var rect = Rect(10, 20)
//
//    print(rect.height)
//    print(rect.width)

//    var son = son()
//    son.act()
//    println(son.chactor)

//    var p = person()
//    if (p is IMan) {
//        p.eat()
//        p.walk()
//    }

    var midChild = midChild()
    midChild.wash()

}