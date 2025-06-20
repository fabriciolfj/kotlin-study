package com.github.fabriciolfj.demo.example1

class Generics {
}

fun <T: Number> acrescentar1(value: T) : Int {
    return value.toInt() + 1
}

interface Calcular<in T, out R> {
    fun execute(valor: T) : R
}

class CalcularImpl : Calcular<String, Long> {
    override fun execute(valor: String): Long {
        return valor.toLong() + 2L
    }

}

fun main() {
    val result = acrescentar1(2)
    println(result)

    val calcular = CalcularImpl()
    println(calcular.execute("2"))
}