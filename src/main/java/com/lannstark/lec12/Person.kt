package com.lannstark.lec12

class Person private constructor(
    var name: String,
    var age: Int
) {

//    companion object {
//        val MIN_AGE = 1
//        fun newBaby(name: String): Person {
//            return Person(name, MIN_AGE)
//        }
//    }

    companion object Factory : Log {
        const val MIN_AGE = 1
        override fun log() {
            println("Log")
        }
    }

}