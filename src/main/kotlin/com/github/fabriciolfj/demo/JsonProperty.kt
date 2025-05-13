package com.github.fabriciolfj.demo

interface JsonProperty<T> {

    fun fromJson(value: String) : T
}