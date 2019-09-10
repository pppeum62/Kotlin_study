fun main(args: Array<String>) {
    var num = 1
    when(num) {
        1 -> println("One")
        1.inc() -> println("Two")
        (1 * 3) -> println("Three")
        else -> println("No Match")
    }

    when(num){
        1 -> {
            println("One")
            println(num)
        }
        2 -> {
            println("Two")
            println(num)
        }
    }

    var a = 10.0
    var b = 20.0
    var op : Char = '+'
    val result : Double? = when(op){
        '+' -> a + b
        '-' -> a - b
        else -> null
    }

    println(result)

    var grade = "A+"
    var gradeResult = when(grade){
        "A+", "a+", "A-", "a-" -> "수"
        "B+", "b+", "B-", "b-" -> "우"
        else -> "가"
    }

    println(gradeResult)

    var x : Any = "Hello"
    when(x){
        is String -> println(x.length)
        is Int -> println(x * 2)
        is Double -> println(x.toInt())
        else -> println("No Match")
    }

    var score = 100
    var grade2 = when(score) {
        in 91 .. 100 -> "A"
        in 81 .. 90 -> "B"
        else -> "C"
    }
}