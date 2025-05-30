package com.github.fabriciolfj.demo

fun interface MathOperations<T> {

    operator fun plus(other: T) : T
}