package com.github.fabriciolfj.demo.delegadas

import kotlin.reflect.KProperty

class Person(val name: String, age: Int, salary: Int): Observable() {
    var age by ObservableProperty(age, this)
    var salary by ObservableProperty(salary, this)

    private val onChange = { propriedade: KProperty<*>, oldValue: Any?, newValue: Any? ->
        notifyObservers(propriedade.name, oldValue, newValue)
    }

    val emails by lazy { loadEmails(this) }

    private fun loadEmails(person: Person)  = listOf("test@outlook.com")
}