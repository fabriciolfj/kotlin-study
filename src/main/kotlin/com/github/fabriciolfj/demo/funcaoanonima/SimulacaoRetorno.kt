package com.github.fabriciolfj.demo.funcaoanonima

class SimulacaoRetorno {
}

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

//funcao anonima
fun lookForAlice(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") return //retorna a funcao fun e mais proxima e nao a lookForAlice que chamou como em funcoes normais
        println("${person.name} is not Alice")
    })
}

fun main() {
    lookForAlice(people)
    // Bob is not Alice.
}
