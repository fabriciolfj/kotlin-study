package com.github.fabriciolfj.demo.funcoes

class Example1 {
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println(result)
}

fun String.filter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@filter) {  // <- AQUI volta para iterar na string original e nao no this do buildstring
            if (predicate(char)) append(char)
        }
    }
}

fun main() {
    twoAndThree { a, b -> a + b}
    twoAndThree { a, b -> a * b}
}