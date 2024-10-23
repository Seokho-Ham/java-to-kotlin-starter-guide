package com.lannstark.lec15

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)

    for (i in arr.indices) {
        println("${i} ${arr[i]}")
    }

    for ((i, value) in arr.withIndex()) {
        println("${i} ${value}")
    }

    arr.plus(6)

    //collection
    val emptyList = emptyList<Int>()
    val list = listOf(1, 2, 3, 4, 5)
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

    list.plus(6)
    mutableList.add(6)

    println(list)
    println(mutableList)


    //map
    val oldMAp = mutableMapOf<Int, String>()
    oldMAp[1] = "MONDAY"
    oldMAp[2] = "TUESDAY"

    val newMap = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in newMap.keys) {
        println("${key} ${newMap[key]}")
    }

    for ((key, value) in newMap.entries) {
        println("${key} ${value}")
    }
}