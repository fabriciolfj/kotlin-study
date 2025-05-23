package com.github.fabriciolfj.demo

data class Point(val x: Int, val y: Int) {
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


fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    // Point(x=40, y=60)

    val p = Point(10, 20)
    println(p * 1.5)
    println(1.5 * p)

    println('a' * 3)

}
