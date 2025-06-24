package com.github.fabriciolfj.demo.reflection

import kotlin.reflect.full.memberProperties

class Example {
}

class Person(val name: String, val age: Int)


fun main() {
    val person = Person("Alice", 29)
    val kClass = person::class
    println(kClass.simpleName)

    kClass.memberProperties.forEach { println(it) }
}