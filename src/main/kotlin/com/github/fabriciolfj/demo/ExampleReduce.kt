package com.github.fabriciolfj.demo

class ExampleReduce {


}

fun main() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.reduce { acc, value -> acc + value}
    println(summed)

    val summedV2 = list.runningReduce { acc, value -> acc + value}
    println(summedV2)
}