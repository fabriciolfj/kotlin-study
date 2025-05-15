package com.github.fabriciolfj.demo

class ExampleFold {
}

fun main() {
    val people = listOf(
        Person("Alex"),
        Person("Natalia")
    )
    println(people.fold("") {acc, person -> acc + person.name})

    println(people.runningFold("") { acc, person ->
        acc + person.name
    })
    // [, Alex, AlexNatalia]
}
