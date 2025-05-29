package com.github.fabriciolfj.demo

class InlineDemo {
}

inline fun repetir(vezes: Int, acao: () -> Unit) {
    for (i in 1..vezes) {
        acao()
    }
}

fun exemplo() {
    repetir(5) {
        println("Tentativa")
        if (Math.random() > 0.5) {
            return  // Este return sai da função 'exemplo', não só da lambda!
        }
    }
    println("Fim da função")
}

fun main() {
    exemplo()
}