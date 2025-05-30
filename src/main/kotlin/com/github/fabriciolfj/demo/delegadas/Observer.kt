package com.github.fabriciolfj.demo.delegadas

fun interface Observer {

    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}

