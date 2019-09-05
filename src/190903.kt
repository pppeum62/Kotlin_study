fun main(args: Array<String>){
    var str = "Hello\nWor\tld"
    println(str)

    var raw = """Hello
World ^^
안녕...
!!"""
    println(raw)

    var name = "철수"
    var num = 200
    var str2 = "안녕하세요. "+name+" "+num
    println(str2)

    var str3 = "안녕하세요. $name $num ${100 + 2} ${num + 200} ${name.length}"
    println(str3)

    //배열
    var arr = Array<Int>(3){0}
    println(arr[0])

    var arr2 = arrayOf(1, 2, 3)
    println(arr2[0])

    val arr3 = arrayOf("사과", "배", "포도")
    println(arr3[0])

    var anyVal : Any
    anyVal = 100
    anyVal = "Hello"
    anyVal = arrayOf(1, 2, 3)

    var num1 = 100
    var num1double = num1.toDouble()
    var numInt : Int = 200
    var numLong : Long = numInt.toLong()

    var strToInt = "1234".toInt()

    // null -> 값이 없음을 알려주는 값
    var nInt : Int = 100
    //nInt = null
    nInt = 200

    //Nullable 타입 -> 타입 뒤에 ?를 붙여서 타입 지정
    var nInt2 : Int? = null

    var str1 : String? = null
    println(str1?.length)
    str1 = "Hello"
    println(str1.length)

    var str4 : String? = null
    println(str4?.length)
    //println(str4!!.length)
    //프로그래머가 직접 값이 null이 아님을 보증
    //따라서 실패할 경우 NullPointerException 예외가 발생

    var str5 : String? = null
    var len = str5?.length ?: 0 // 반환 값이 null인 경우 대입할 값을 ?: 다음 값으로 변환
    // 이 코드의 경우 0 대입
    println(len)

    var num2 = "안녕".toIntOrNull() ?: 1234
    println(num2)
}