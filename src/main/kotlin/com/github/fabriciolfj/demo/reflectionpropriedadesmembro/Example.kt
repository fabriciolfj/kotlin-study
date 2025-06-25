package com.github.fabriciolfj.demo.reflectionpropriedadesmembro


class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 29)
    val memberProperty = Person::age
    println(memberProperty.get(person))
}