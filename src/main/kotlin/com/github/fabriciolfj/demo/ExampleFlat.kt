package com.github.fabriciolfj.demo

class ExampleFlat {
}

val library = listOf(
    Book("Kotlin in Action", listOf("Isakova", "Elizarov", "Aigner", "Jemerov")),
    Book("Atomic Kotlin", listOf("Eckel", "Isakova")),
    Book("The Three-Body Problem", listOf("Liu"))
)

fun main() {
    val authors = library.flatMap { it.authors }
    println(authors)
    // [Isakova, Elizarov, Aigner, Jemerov, Eckel, Isakova, Liu]
    println(authors.toSet())
    // [Isakova, Elizarov, Aigner, Jemerov, Eckel, Liu]
}
