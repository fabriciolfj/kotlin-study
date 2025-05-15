package com.github.fabriciolfj.demo

data class Person(val name: String, val age : Int = 0) {

    companion object : JsonProperty<Person> {
        override fun fromJson(value: String) : Person {
            //todo
            return Person("test")
        }
    }
}