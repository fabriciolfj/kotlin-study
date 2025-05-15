package com.github.fabriciolfj.demo

class ExampleGroups {
}

fun main() {
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29),
        Person("Carol", 31)
    )
    println(people.groupBy { it.age })

    val list = listOf("apple", "apricot", "banana", "cantaloupe")
    println(list.groupBy(String::first))
}