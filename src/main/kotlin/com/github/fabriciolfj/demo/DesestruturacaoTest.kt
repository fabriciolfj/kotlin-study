package com.github.fabriciolfj.demo

class DesestruturacaoTest {
}
data class NameComponents(val name: String,
                          val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val (x, y) = fullName.split('.', limit = 2)
    return NameComponents(x, y)
}

fun printEntries(map: Map<String, String>) {
    map.forEach { (k, v) -> println("$k - $v") }
}

fun main() {
    val p = Point(10, 20)
    val (x, y) = p

    println(x)
    println(y)

    val (name, ext) = splitFilename("example.kt")
    println(name)
    // example
    println(ext)
    // kt

    val maps = mapOf("oracle" to "java", "idea" to "kotlin")
    printEntries(maps)

    val (n, _, l) = Person("fabricio", 30, "jacob")
    println("$n - $l")
}
