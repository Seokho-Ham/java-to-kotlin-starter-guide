package com.lannstark.lec10

interface Swimable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("Swimming")
    }

    fun fly()

}