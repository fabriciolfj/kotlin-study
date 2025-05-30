package com.github.fabriciolfj.demo

class TestZip {
}

fun main() {

    val numeros = 1 until 10;
    val nomes = listOf("fabricio", "lucas")

    val numeros2 = 10 until 21;
    val nomes2 = listOf("carlos", "roberto")

    val dados = Dados(nomes, numeros.toList())
    val dados2 = Dados(nomes2, numeros2.toList())

    val list = listOf(dados, dados2);

    val result = list.mapNotNull { Pair(it.nomes, it.numeros) }
        .reduce { s, f -> Pair(s.first + f.first, s.second + f.second) }

    val result2 = list.groupBy { Pair(it.nomes, it.numeros) }

    println()
}