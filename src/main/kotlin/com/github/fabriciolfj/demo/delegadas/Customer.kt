package com.github.fabriciolfj.demo.delegadas

class Customer {

    private val _attributes = mutableMapOf<String, String>()

    fun setAttibutes(attrName: String, value: String) {
        _attributes += attrName to value
    }

    var name: String by _attributes
}