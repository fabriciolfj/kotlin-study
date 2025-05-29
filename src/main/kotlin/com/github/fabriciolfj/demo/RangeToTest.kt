package com.github.fabriciolfj.demo

import java.time.LocalDate

class RangeToTest {
}

fun main() {
    val now = LocalDate.now()
    val weeks = now..now.plusDays(10)
    println(now.plusWeeks(1) in weeks)

    val n = 9
    println(0..(n +1))

    (0..n).forEach { println(it) }
}