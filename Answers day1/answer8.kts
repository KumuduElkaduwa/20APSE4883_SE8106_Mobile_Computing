#!/usr/bin/env kotlin

fun main() {
    val numbers = listOf(-3, 7, -1, 5, -2, 9)

    var sum = 0
    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}