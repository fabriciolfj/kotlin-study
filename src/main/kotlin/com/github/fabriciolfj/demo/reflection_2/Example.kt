package com.github.fabriciolfj.demo.reflection_2

import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

// 1. Definindo as annotations
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class NotEmpty(val message: String = "Campo não pode estar vazio")

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class MinLength(val value: Int, val message: String = "Tamanho mínimo não atendido")

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Email(val message: String = "Email inválido")

// 2. Usando as annotations
data class Usuario(
    @NotEmpty(message = "Nome é obrigatório")
    @MinLength(value = 2, message = "Nome deve ter pelo menos 2 caracteres")
    val nome: String,

    @NotEmpty
    @Email
    val email: String,

    val idade: Int
)

// 3. Processador das annotations
class Validador {
    fun validar(obj: Any): List<String> {
        val erros = mutableListOf<String>()
        val clazz = obj::class

        clazz.memberProperties.forEach { propriedade ->
            val valor = propriedade.call(obj)

            // Verificar @NotEmpty
            propriedade.findAnnotation<NotEmpty>()?.let { annotation ->
                if (valor is String && valor.isEmpty()) {
                    erros.add(annotation.message)
                }
            }

            // Verificar @MinLength
            propriedade.findAnnotation<MinLength>()?.let { annotation ->
                if (valor is String && valor.length < annotation.value) {
                    erros.add(annotation.message)
                }
            }

            // Verificar @Email
            propriedade.findAnnotation<Email>()?.let { annotation ->
                if (valor is String && !valor.contains("@")) {
                    erros.add(annotation.message)
                }
            }
        }

        return erros
    }
}

// 4. Uso
fun main() {
    val usuario = Usuario("", "email-invalido", 25)
    val validador = Validador()
    val erros = validador.validar(usuario)

    erros.forEach { println(it) }
    // Output:
    // Nome é obrigatório
    // Email inválido
}