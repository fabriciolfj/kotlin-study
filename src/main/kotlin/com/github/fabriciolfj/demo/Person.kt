package com.github.fabriciolfj.demo

data class Person(val name: String, val age : Int = 0, val lasName: String = "") : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::age, Person::name)
    }

    companion object : JsonProperty<Person> {
        override fun fromJson(value: String) : Person {
            //todo
            return Person("test")
        }
    }


}