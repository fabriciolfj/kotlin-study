package com.github.fabriciolfj.demo

class ExampleOperatorsList {
}

fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Bob", 31))

    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.none(canBeInClub27))

    println(emptyList<Int>().all { it > 42 })


    val comeIn = people.filter(canBeInClub27)
    val stayOut = people.filterNot(canBeInClub27)
    println(comeIn)
    println(stayOut)

    val (comeInV2, stayOutV2) = people.partition(canBeInClub27)
    println(comeInV2)
    println(stayOutV2)
}