package com.lannstark.lec09

class Person(
    val name: String = "함석호",
    var age: Int = 1
) {
//    val name = name
//        get() = field.uppercase()

    val getUppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age < 0) {
            throw IllegalArgumentException("${age}는 0보다 작을 수 없습니다.")
        }
    }

//    constructor(name: String) : this(name, 10)
//    constructor() : this("이름 없음")

    val isAdult: Boolean
        get() = this.age >= 20


}