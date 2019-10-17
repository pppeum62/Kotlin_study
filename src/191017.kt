import java.lang.Exception

class GetterSetterDemo() {
    var num : Int = 0
        set(value) { field = value }
        get() = field
}

class Person6(pAge: Int) {
    var age = pAge
        set(value) {
            if(value > 20) {
                throw Exception("비정상적인 나이 입력값")
            }
            field = value
        }

    var isMinor: Boolean
        get() = this.age < 20

    init {
        isMinor = pAge < 20
    }
}

class lazyClass(x: Int) {
    val lazyValue1 by lazy {
        println("lazyValue1")
        var s = "Hello"
        s.toLowerCase().trim()
    }

    val lazyValue2 by lazy {
        println("lazyValue2")
        x * 2
    }
}

fun main(args: Array<String>){
    var d = GetterSetterDemo()
    println(d.num)
    d.num = 100

    var l = lazyClass(10)
    println(l.lazyValue1)
    println(l.lazyValue2)
}