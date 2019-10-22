import java.lang.Math

interface MyInterFace {
    var prop : Int
    fun concreteMethod() : Int {
        println("from concrete")
        return 100
    }
    fun abstractMethod() : Int
}

class Impl(prop: Int) : MyInterFace {
    override var prop: Int = prop
        get() = field * -1
        set(value) {
            field = if(value <= 0) value * -1 else value
        }


    override fun abstractMethod(): Int {
        return 100
    }
}

interface Shape {
    fun calculateArea(): Double         // 면적
    fun calculatePerimeter(): Double    // 둘레
}

// Q1) 사각형(Rectangle) 클래스를 만들고
// Shape 인터페이스를 상속 받아 내용을 구현하시오

class Rectangle(var width : Double, var height : Double) : Shape {

    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return (width * 2) + (height * 2)
    }

}

// Q2) 원(Circle) 클래스를 만들고
// Shape 인터페이스를 상속 받아 내용을 구현하시오

class Circle(var radius: Double) : Shape {

    override fun calculateArea(): Double {
        return Math.PI * (radius * radius);
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

}

fun main(args: Array<String>){
    var r = Rectangle(1.0, 2.0)
    var c = Circle(1.0)

    // is는 java의 instanceof이다. (타입 확인용)
    println(r is Rectangle)     // true
    println(r is Shape)         // true
    println(r is Any)           // ture

    // as (타입 캐스팅 연산자)
    var s1 : Shape = r as Shape
    var s2 : Shape = c

    var r1 = s1 as Rectangle
    var c1 = s2 as Circle
}