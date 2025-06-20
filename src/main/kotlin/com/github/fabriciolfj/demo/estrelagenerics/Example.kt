package com.github.fabriciolfj.demo.estrelagenerics
import kotlin.reflect.KClass

class Example {
}


fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}


/*fun main() {
    printFirst(listOf("Sveta", "Seb", "Dima", "Roman"))
    // Sveta
}*/

object Validators {
    private val validators =
        mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T: Any> registerValidator(
        kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException(
                "No validator for ${kClass.simpleName}")
}

fun main() {
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)

    println(Validators[String::class].validate("Kotlin"))
    // true
    println(Validators[Int::class].validate(42))
    // true

    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    //validators[String::class]!!.validate("") //error
}



/*fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    //validators[String::class]!!.validate("") error
}*/