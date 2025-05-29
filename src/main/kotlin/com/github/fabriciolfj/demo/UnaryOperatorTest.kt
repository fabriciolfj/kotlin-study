package com.github.fabriciolfj.demo

class UnaryOperatorTest {
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun Point.inc(): Point {
    return Point(++x, ++y)
}

fun main() {
    var p = Point(10, 20)
    println(-p)
    // Point(x=-10, y=-20)

    println(++p)
}
