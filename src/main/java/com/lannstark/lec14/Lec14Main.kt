package com.lannstark.lec14


fun main() {
    val dto1 = PersonDto("lannstark", 30)
    val dto2 = PersonDto("lannstark", 30)
    println(dto1 == dto2) // false
    println(dto1 === dto2) // false
    println(dto1)


}

fun handleCountry (country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.USA -> println("미국")
        Country.JAPAN -> println("일본")
    }
}

data class PersonDto(
    val name: String,
    val age: Int
)

enum class Country (
    private val code: String,
) {
    KOREA("KR"),
    USA("US"),
    JAPAN("JP")
}

sealed class HyundaiCar (
    val name: String,
    val price: Long
)

class Sonata: HyundaiCar("Sonata", 30000000)
class Grandeur: HyundaiCar("Grandeur", 40000000)
class Avante: HyundaiCar("Avante", 20000000)