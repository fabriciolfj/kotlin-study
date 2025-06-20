package com.github.fabriciolfj.demo.generics_1

import org.slf4j.LoggerFactory

class Simulacao {
}


//reified preserva o tipo
inline fun <reified T> isA(value: Any) = value is T
inline fun <reified T> logger() = LoggerFactory.getLogger(T::class.java)


fun main() {
    val logger = logger<Simulacao>()
    println(isA<String>("abc"))

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}