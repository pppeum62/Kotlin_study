import kotlin.random.Random
import myPackage.myUtilFunc as utilFunc

fun outer(){
    fun inner() : String {
        return "Hello"
    }
    println(inner())
}

fun returnRandomListGenerator(amount: Int, strategy: (Random) -> Int = { r-> r.nextInt() }) : () -> Array<Int> {
    val r = Random(System.currentTimeMillis())
    return {
        val arr = Array(amount){0}

        for(i in 0 until amount) {
            arr[i] = strategy(r)
        }

        arr
    }
}

// 함수를 전달받는 함수
fun calcurator(calcFunc: (Int, Int) -> Int, x: Int, y: Int) : Int {
    return calcFunc(x, y)
}

// 함수를 돌려주는 함수
fun returnStringPrintFunc(str : String, num : Int) : () -> Unit {
    var n = num
    return{
        for(i in 1 .. n) {
            println(str)
        }
        println()
        n++
    }
}

fun main(args: Array<String>){
    // Q) returnStringPrintFunc 함수 정의 (이 함수는 람다 함수는 아님)
    // 해당 함수는 함수를 돌려줍니다.
    // 다음과 같이 사용합니다
    // var f = returnStringPrintFunc("Hello", 1)
    // f() -> Hello 출력
    // f() -> Hello Hello 출력

    // var f = returnStringPrintFunc("Bye", 3)
    // f() -> Bye Bye Bye 출력
    // f() -> Bye Bye Bye Bye 출력

    val f1 = returnStringPrintFunc("Hello", 1)
    f1()
    f1()

    val calcResult1 = calcurator({x, y -> x + y}, 2, 3)
    val calcResult2 = calcurator({x, y -> x * y}, 2, 3)

    val getFiveRandomNumber = returnRandomListGenerator(5)
    val fiveRandomNumbers = getFiveRandomNumber()
    for(randomNumber in fiveRandomNumbers) {
        println(randomNumber)
    }

    // Q) 1-6까지 주사위 눈을 10번 굴린 결과를 담은 배열을 출력하는 함수 만들기
    var generateRandom10DiceNumber = returnRandomListGenerator(10) {it.nextInt(1, 7)}

    for(n in generateRandom10DiceNumber()){
        println(n)
    }
}