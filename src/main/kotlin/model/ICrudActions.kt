package main.kotlin.model

interface ICrudActions {

    fun create(): String  // Método sin implementación.

    fun read(): String

    fun update(): String

    fun delete(): String

    fun saludar(message: String) {  // Implementación de un método con contenido.
        println("Método interface saludar(): $message")
    }
}