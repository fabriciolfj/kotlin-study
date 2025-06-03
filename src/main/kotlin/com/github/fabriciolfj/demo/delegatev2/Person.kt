package com.github.fabriciolfj.demo.delegatev2

class Person {
    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    var name: String by _attributes //automaticamente coloca como chave o nome da propriedade
}
