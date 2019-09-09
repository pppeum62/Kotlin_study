data class Person(var name : String, var age : Int)

fun main(args: Array<String>) {
    var a = 100
    var b = 200
    var c = a + 10
    c += 20
    c++
    println(c)

    var p1 = Person("김철수", 20)
    var p2 = Person("김철수", 20)
    println(p1 == p2) // java의 .equals
    println(p1 === p2) // java의 ==

    var arr = arrayOf(1, 2, 3)
    var b1 = 3 in arr // 배열이나 목록에 특정 값이 포함되어 있는지 체크
    var b2 = 10 in arr
    println(b1)
    println(b2)

    // 제어문
    var d = 200
    if(d >= 200){
        println("Hello")
    } else{
        println("Bye")
    }

    var r = if(d >= 200) "Hello" else "Bye"
    println(r)
}