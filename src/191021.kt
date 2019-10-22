open class Person7(var name: String) {
    fun eat(food: String){
        println("${name}이 ${food}를 먹습니다.")
    }

    fun func() {
        println("func")
    }

    open fun overridable() {
        println("overridable")
    }
}

class Employee(name: String, var company: String) : Person7(name) {
    fun work() {
        eat("라면")
        super.eat("김밥")
        println("${super.name}이 ${company} 일합니다.")
    }

    override fun overridable() {
        println("overrided")
    }
}

abstract class AbstractClass(var a: Int) {
    fun concrete() {
        println("concrete")
    }

    abstract fun abstractF(arg: Int) : Int
}

class ConcreteClass(a: Int, var b: Int) : AbstractClass(a) {
    override fun abstractF(arg: Int): Int {
        return 0
    }
}

class LateIninClass {
    // lateinit
    lateinit var a: String
    // lateinit var b: Int

    fun ready() {
        a = "Hello"
    }

    fun method() {
        println(a.length)
    }
}

fun main(args: Array<String>){
    var c = LateIninClass()
    c.ready()
    c.method()
}