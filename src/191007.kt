class Person5(var name: String, var age: Int, val gender: String) {
    var job : String = "Unknown"
    var salary: Int? = null

    // Q1) 보조 생성자 Person5("김철수", 20, "남자", "목수")
    constructor(name: String, age: Int, gender: String, job: String) : this(name, age, gender) {
        this.job = job
    }

    // Q2) 보조 생성자 Person5("김철수", 20, "남자", "목수", 3000)
    constructor(name: String, age: Int, gender: String, job: String, salary: Int) : this(name, age, gender, job) {
        this.salary = salary
    }
}

fun main(args: Array<String>) {

}