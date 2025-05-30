package com.github.fabriciolfj.demo.delegadas

import kotlin.reflect.KProperty

class ObservableProperty(var propValue: Int, val observable: Observable) {

    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Int = propValue

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        observable.notifyObservers(prop.name, oldValue, newValue)
    }
}