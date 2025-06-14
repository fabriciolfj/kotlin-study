package com.github.fabriciolfj.demo.generics

class LimitandoMain {
}

fun <T: Number> onHalf(value: T) : Double {
    return value.toDouble() / 2.0
}

fun <T: Comparable<T>> max(first: T, second: T) : T {
    return if (first > second) first else second
}

fun <T: Number> sum(value : T): T {
    return  value
}


fun main() {
    println(onHalf(1.03))
    println(max(2, 3))
    println(sum(10))
}