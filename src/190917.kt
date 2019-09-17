/*
fun 함수이름(인자이름 : 인자타입, 인자이름 : 인자타입, ... ) : 반환타입 {
    //필요한코드

    return 반환값
}
 */

fun printHello() : Unit {   // Unit이 void를 대체
    println("Hello")        // Unit은 생략 가능 (반환값이 없을 때)
}

fun printName(name : String) {
    println("Hello $name")
}

fun main(args: Array<String>){
    printHello()
    printName("이기쁨")
}