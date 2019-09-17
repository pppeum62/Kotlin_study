fun main(args: Array<String>) {
    /*var a = 1
    while(a <= 10){
        println(a)
        a++
    }*/

    /*var a = 1
    do{
        println(a)
        a++
    } while(a <= 10)*/

    /*for(i in 1 .. 10){
        println(i)
    }*/

    /*var range = 1 .. 10
    println(range)
    println(range.first)
    println(range.last)

    for(i in range) {
        println(i)
    }*/

    // until, downTo <= infix operator (중위 연산자)
    /*var range2 = 1 until 10 // 1 - 9
    var range3 = 10 downTo 1 // 10 - 1
    var range4 = 1 .. 10 step 2 // 1 3 5 7 9
    var aToz = 'a' .. 'z' // a b c d ... x y z

    for(i in aToz){
        println(i)
    }*/

    // Q) 구구단 짜기 (범위 객체와 String template 이용)
    /*for(i in 2 until 10){
        for(j in 2 until 10){
            println("$i x $j = ${i*j}")
        }
    }*/

    // Q) '가'부터 '나' 바로 직전 글자까지 순회
    /*for(i in '가' until '나'){
        print(i)
    }*/

    // Q) 별찍기
    // *
    // **
    // ***
    /*for(i in 1 .. 3){
        for(j in 1 .. i){
            print('*')
        }
        println()
    }*/

    var arr = arrayOf(1, 2, 3)
    // var arr = arrayOf("Hello", "Kotlin")
    for(i in arr) {
        println(i)
    }

    for(c in "Hello"){
        println(c)
    }

    //키, 값 쌍
    var pair1 = Pair("name", "이기쁨")
    var pair2 = Pair("age", 18)
    var pair3 = 100 to "hundred"

    var myMap : Map<Any, Any> = mapOf(pair1, pair2, pair3)
    println(myMap)

    for(item in myMap){
        println(item)
    }

    println(myMap["name"])

    // Q) 짝수로 된 구구단만 출력
    for(i in 2 until 10){
        if(i % 2 != 0) continue
        for(j in 2 until 10){
            println("$i x $j = ${i*j}")
        }
    }
}