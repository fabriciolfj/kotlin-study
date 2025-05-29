package com.github.fabriciolfj.demo.delegadas

class Person(val name: String, age: Int, salary: Int): Observable() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObservers(
                "age", oldValue, newValue
            )
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObservers(
                "salary", oldValue, newValue
            )
        }

    val emails by lazy { loadEmails(this) }

    private fun loadEmails(person: Person)  = listOf("test@outlook.com")
}