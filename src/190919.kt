// Q) 두 정수 값을 더해서 반환하는 sum 함수 정의
fun sum(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

// Q) 더 큰 값을 돌려주는 getBigger 함수를 정의하되 if문을 표현식으로 사용하여
// 함수를 대입하는 형식으로 정의
fun getBigger(num1 : Int, num2 : Int) = if(num1 > num2) num1 else num2

// Q) 점수(score)를 받아서 91 ~ 100까지 "A", 81 ~ 90까지 "B", 나머지는 "C"를 반환하는
// getGrade 함수를 정의하되 when - case 문을 표현식으로 사용하여 함수를 대입하는 형식으로 정의
fun getGrade(score : Int) = when(score) {
    in 91 .. 100 -> "A"
    in 81 .. 90 -> "B"
    else -> "C"
}

fun sumWithDefault(a : Int=10, b : Int=20) : Int {
    return a + b
}

// 가변인자
fun numWithVargs(vararg nums : Int) : Int {
    return 0
}

// Q) 전달받은 가변인자의 값을 모두 더하는 코드 작성
// hint) nums는 배열
fun sumWithVargs(vararg nums : Int) : Int {
    var sum = 0
    for(n in nums){
        sum += n
    }

    return sum
}

fun main(args: Array<String>){
    println(getBigger(10, 6))
    println(getGrade(96))
    
    sumWithDefault(b=40) // 인자값 지정 가능
    sumWithDefault(b=40, a=100) // 인자값 지정이 가능하기 때문에 순서 상관 x

    numWithVargs(1)
    numWithVargs(1, 2)
    numWithVargs(1, 2, 3) // 가변인자이기 때문에 변수의 개수 제한 x

    var sum = sumWithVargs(1, 2, 3)
    println(sum)

    var arr = intArrayOf(1, 2, 3)
    sumWithVargs(arr[0], arr[1], arr[2])
    sumWithVargs(*arr) // spread operator
}