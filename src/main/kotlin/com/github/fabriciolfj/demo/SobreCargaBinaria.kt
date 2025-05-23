package com.github.fabriciolfj.demo

class SobreCargaBinaria {
}

fun main() {
    val list = mutableListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    // [1, 2, 3]
    println(newList)
    // [1, 2, 3, 4, 5]

    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)
    // Point(x=4, y=6)
}
