package com.github.fabriciolfj.demo.delegatev2


fun main() {
    val p = Person()
    val data = mapOf("name" to "Seb", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
    // Seb
    p.name = "Sebastian"
    println(p.name)
    // Sebastian
}