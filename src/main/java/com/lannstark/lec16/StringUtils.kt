package com.lannstark.lec16

fun main() {
    val str = "ABC"
    val lastChar = str.lastChar()
    println(lastChar)

    val person = Person("lannstark", "HAM", 30)
    person.nextYearAge()
}

fun String.lastChar(): Char = this[this.length - 1]

fun Person.nextYearAge(): Int {
    println("확장함")
    return this.age + 1
}

infix fun Int.add2(x: Int) = this + x

inline fun Int.add(other: Int): Int {
    return this + other
}

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("Cannot create person with empty $fieldName")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 30)
}
