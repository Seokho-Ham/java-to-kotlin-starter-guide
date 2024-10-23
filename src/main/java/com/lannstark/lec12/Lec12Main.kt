package com.lannstark.lec12

fun main() {
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("Move")
        }

        override fun fly() {
            println("Fly")
        }
    })

    Person.MIN_AGE

}

object Singleton {
    var a: Int = 0

    fun log() {
        println("Log")
    }
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}