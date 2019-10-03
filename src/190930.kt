class Car {
    var speed: Int = 0
    var isMoving: Boolean = true

    fun acceleate() {
        speed += 10
    }
    fun move() {
        isMoving = true
    }
    fun stop() {
        isMoving = false
    }

    // Q) 현재 속도를 출력하는 showSpeed 메소드 만들기
    fun showSpeed() {
        println(speed)
    }
}

class Person1 {
    var name : String = "무명씨"
    var age : Int = 0
}

// Q) Person2 클래스 정의하면서
// 이름, 나이, 성별(gender)를 주 생성자로 받도록 정의
class Person2(var name : String, var age : Int, val gender : String) {

}

class Person3(name : String, age : Int, gender : String) {

}

class Spy(realName: String, realAge: Int, val id: String) {
    var name: String
    var age: Int

    init {
        name = realName.reversed()
        age = realAge * 2
    }
}

// Q) Person4 정의
// 나이를 입력받고 (이름이나 성별은 생략)
// 나이값을 초기화함과 동시에 미성년자(isMinor)인지 여부(Boolean)도 초기화하게 만들기
// (init 블록 사용)
class Person4(age: Int) {
    var age: Int = age
    var inMinor : Boolean

    init {
        inMinor = if(age < 20) true else false

    }
}

fun main(args: Array<String>){
    var c1 = Car()
    // 주생성자가 없기 때문에 괄호 안 작성 x

    var p1 = Person1()
    p1.name = "이기쁨"
    p1.age = 18

    var p2 = Person2("이기쁨", 18, "여자")
    var p3 = Person2(gender="여자", name="이기쁨", age=18)

    var pp = Person3("이기쁨", 18, "여자")

    println(p2.name)

    var spy = Spy("이기쁨", 18, "1234")
    println(spy.name)
    println(spy.age)
    println(spy.id)

    var p4 = Person4(18)
}