fun main(args: Array<String>) {
    var score = 79
    var grade = if(score > 90){
        "A"
    } else if(score in 80 until 90) {
        "B"
    } else {
        "C"
    }

    println(grade)

    var num1 = 100
    var num2 = 200
    var max = if(num1 > num2) num1 else num2

    println(max)
}