package com.github.fabriciolfj.demo.alias

class Test {
}

typealias NameCombiner = (String, String, String, String) -> String

val authorsCombiner: NameCombiner = { a, b, c, d -> "$a et al." }
val bandCombiner: NameCombiner = { a, b, c, d -> "$a, $b & The Gang" }

fun combineAuthors(combiner: NameCombiner) {
    println(combiner("Sveta", "Seb", "Dima", "Roman"))
}

fun main() {
    combineAuthors(bandCombiner)
    // Sveta, Seb & The Gang
    combineAuthors(authorsCombiner)
    // Sveta et al.
    combineAuthors { a, b, c, d -> "$d, $c & Co."}
    // Roman, Dima & Co.
}
