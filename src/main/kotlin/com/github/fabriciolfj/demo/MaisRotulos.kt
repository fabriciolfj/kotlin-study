package com.github.fabriciolfj.demo

class MaisRotulos {
}

fun main() {
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
    // [1, 2, 3]
}
