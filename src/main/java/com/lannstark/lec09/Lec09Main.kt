package com.lannstark.lec09

fun main() {
    val person = Person("Lannstark", 27)
    println(person.name)
    println(person.age)
    person.age = 28
    println(person.age)
}