package com.github.fabriciolfj.demo.delegadas

open class Observable {

    val observers = mutableListOf<Observer>()

    fun notifyObservers(propName: String, oldValue: Any?, newValue: Any?) {
        for (obs in observers) {
            obs.onChange(propName , oldValue, newValue)
        }
    }
}