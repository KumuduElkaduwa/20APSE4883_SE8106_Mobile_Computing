#!/usr/bin/env kotlin

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 11)
    var guess = 0

    while (guess != number) {
        print("Guess a number between 1 and 10: ")
        guess = readLine()!!.toInt()

        if (guess != number) {
            println("Wrong guess. Try again!")
        }
    }

    println("Correct! The number was $number")
}