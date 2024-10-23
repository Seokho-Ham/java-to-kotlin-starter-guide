package com.lannstark.lec18



fun main() {

    val fruits = listOf(
        Fruit(1L, "사과", 1000, 800),
        Fruit(2L, "사과", 1200, 800),
        Fruit(3L, "사과", 1200, 800),
        Fruit(4L, "사과", 1500, 800),
        Fruit(5L, "바나나", 3000, 800),
        Fruit(6L, "바나나", 3200, 800),
        Fruit(7L, "바나나", 2500, 800),
        Fruit(8L, "수박", 1000, 800)
    )

    val applePrice = fruits.filter { it.name == "사과" }
        .map { it.currentPrice}

    println(applePrice)

}

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
)
