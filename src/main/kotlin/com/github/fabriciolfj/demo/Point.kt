package com.github.fabriciolfj.demo

data class Point(var x: Int, var y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.times(scale: Double) : Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(point: Point) : Point {
    return Point((point.x * this).toInt(), (point.y * this).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}


fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    // Point(x=40, y=60)

    val p = Point(10, 20)
    println(p[1])
    println(p * 1.5)
    println(1.5 * p)

    println('a' * 3)

    val p3 = Point(10, 20)
    println(p3[1])

    val p4 = MutablePoint(10, 20)
    p4[1] = 42
    println(p4)
}
