package com.lannstark.lec07

import com.lannstark.lec08.max

fun parseIntOrThrow(str: String): Int {

    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("숫자가 아닙니다.")
    }

}

fun parseIntOrThrowV2(str: String): Int? {

    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }

}

fun main() {
    val printer = FilePrinter()
    printer.readFile()
}

