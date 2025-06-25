package com.github.fabriciolfj.demo.reflexaocall


fun foo(x: Int) = println(x)

fun sum(x : Int, y: Int) = x + y

fun main() {
    val kFunction = ::foo

    kFunction.call(42)

    kFunction.invoke(43)

    val kFunction2 = ::sum
    println(kFunction2.invoke(1, 2) + kFunction2.invoke(3, 4))
}