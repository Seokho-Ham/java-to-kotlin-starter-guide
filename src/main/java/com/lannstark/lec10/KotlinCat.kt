package com.lannstark.lec10

class KotlinCat(
    species: String = "Cat",
) : Animal(species, 4) {

    override fun move() {
        println("Walking")
    }
}