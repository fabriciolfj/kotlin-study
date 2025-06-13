package com.github.fabriciolfj.demo

class SimulacaoRetorno {
}

data class Person2(val name: String, val age: Int)

val people = listOf(Person2("Alice", 29), Person2("Bob", 31))

fun lookForAlice(people: List<Person2>) {
    people.forEach label@{
        if (it.name == "Alice") {
            println("Found!")
            return@label
        }
    }
    println("Alice is not found")
}


fun main() {
    lookForAlice(people)
    println()
    // Found!
}
