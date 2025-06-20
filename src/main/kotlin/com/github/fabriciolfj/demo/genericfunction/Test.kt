package com.github.fabriciolfj.demo.genericfunction

class Test {
}

//in so consome (escrever) contravariav
//out do produz, retornar e ler
fun <T> copyData(source: MutableList<out T>,
                       destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}
fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)
    // [1, 2, 3]
}
