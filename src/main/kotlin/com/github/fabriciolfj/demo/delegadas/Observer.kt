package com.github.fabriciolfj.demo.delegadas

interface Observer {

    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}

