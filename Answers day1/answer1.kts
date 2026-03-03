#!/usr/bin/env kotlin


val numbers = listOf(1, 2, 3, 4, 5, 6)
var sum = 0
for (n in numbers) {
    if (n % 2 == 0) sum += n
}
println("Sum of even numbers: $sum")