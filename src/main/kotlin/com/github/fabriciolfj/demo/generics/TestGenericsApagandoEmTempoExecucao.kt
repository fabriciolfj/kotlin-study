package com.github.fabriciolfj.demo.generics

class TestGenericsApagandoEmTempoExecucao {
}


fun printSum(c: Collection<*>) {
    var intList = c as? List<Int> ?: throw IllegalArgumentException()
    println(intList.sum())
}

fun main() {
    printSum2(listOf(1, 2, 3))
    // 6
    printSum2(setOf(1, 2, 3))
    // IllegalArgumentException: List is expected
    printSum(listOf("1", "1" , "1"))
}


fun printSum2(c: Collection<Int>) {
    when (c) {
        is List<Int> -> println("List sum: ${c.sum()}")
        is Set<Int> -> println("Set sum: ${c.sum()}")
    }
}

