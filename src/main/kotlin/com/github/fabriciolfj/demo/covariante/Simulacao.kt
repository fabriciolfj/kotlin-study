package com.github.fabriciolfj.demo.covariante

class Simulacao {
}


open class Animal {
    fun feed() {}
}

//covariante palavra chave out (com out exige que a classe so tenha o tipo T em saida da funcao, nunca como recebendo de parametro (in)
//no caso do constructor aceita se for variavel privada
class Herd<out T: Animal> {
    val size : Int get() = 0
    operator fun get(i: Int): T  { TODO() }
}

class Cat : Animal() {
    fun cleanLitter() { /* ... */ }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0..<cats.size) {
        cats[i].cleanLitter()
    }
     feedAll(cats)
}


fun feedAll(animals: Herd<Animal>) {
    for (i in 0..animals.size) {
        animals[i].feed()
    }
}

