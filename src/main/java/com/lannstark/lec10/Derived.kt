package com.lannstark.lec10

class Derived (
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}