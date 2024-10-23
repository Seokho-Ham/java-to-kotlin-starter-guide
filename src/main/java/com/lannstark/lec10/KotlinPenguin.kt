package com.lannstark.lec10

class KotlinPenguin(
    species: String = "Penguin"
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount: Int = 2

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun move() {
        println("Swimming")
    }

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}