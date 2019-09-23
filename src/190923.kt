fun returnMultiplyFunc(multiplier : Int) : (Int) -> Int {
    return { x -> x * multiplier }
}

fun main(args: Array<String>) {
    var square : (Int) -> Int = { num : Int -> num * num }
    println(square(4))

    // Q) 람다 함수 형태로 sum 정의 (변수 이름은 sum)
    var sum : (Int, Int) -> Int = { num1 : Int, num2 : Int -> num1 + num2 }
    println(sum(2, 3))

    // Q) 람다 함수 형태로 콘솔에 "Hello"를 출력하는 printHello 함수 정의
    // (입력 값 없음, 반환 값 없음)
    var printHello : () -> Unit = { println("Hello") }
    printHello()

    var myFunc : (Int) -> Int
    myFunc = { n : Int -> (n * n) + n }
    println(myFunc(3))

    val sayHelloTo : (String) -> Unit = { println("say hello to $it") }
    sayHelloTo("이기쁨")

    var retFunc = returnMultiplyFunc( 3 )
    println(retFunc(2))
}