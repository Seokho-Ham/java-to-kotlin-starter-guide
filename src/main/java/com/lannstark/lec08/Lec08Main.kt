package com.lannstark.lec08

fun main() {

    repeat("Hello World", 3, true)
    print("----------------------\n")
    repeat("Hello World", 5, false)

    printNameAndGender(name = "최태현", gender = "남자")

    printAll("A", "B", "C")

    val arr = arrayOf("A", "B", "C")
    printAll(*arr)

}

fun max(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }


fun repeat(str: String, num: Int, useNewLine: Boolean = false) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println("Name: $name")
    println("Gender: $gender")
}

fun printAll(vararg values: String) {
    for (value in values) {
        println(value)
    }
}
