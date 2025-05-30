package com.github.fabriciolfj.demo

data class Vector(val x: Int, val y: Int) : MathOperations<Vector> {

    override fun plus(other: Vector) = Vector(x + other.x, y + other.y)
}


fun main() {
    val vector = Vector(9, 2)
    val result = vector.plus(Vector(3, 4))

    println(result)

    val math = MathOperations<Int> { v -> v + 10 }

    println(math.plus(10))
}