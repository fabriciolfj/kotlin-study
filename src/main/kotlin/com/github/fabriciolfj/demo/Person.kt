package com.github.fabriciolfj.demo

data class Person(val name: String) {

    companion object : JsonProperty<Person> {
        override fun fromJson(value: String) : Person {
            //todo
            return Person("test")
        }
    }
}