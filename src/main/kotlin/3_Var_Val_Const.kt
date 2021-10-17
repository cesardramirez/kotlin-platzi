package main.kotlin

// Variables globales.
var x = 7  // Mala práctica. Variables mutables. Deberían definirse y modificarse dentro de las funciones.
const val y = 8  // (final static) Buenas prácticas. Variable inmutable. Se define en tiempo de compilación.

fun main(args: Array<String>) {
    val a = 4  // (final) Buena práctica. Variables inmutables. Se definen en tiempo de ejecución.
    val b = 2
    var n = 3 // EL IDE indica que la variable nunca se modifica (inmutable) y se puede declarar usando 'val'.

    x = 5

    val name = args[0]  // Se debe definir un valor en Program Arguments.
    println(name)

    println(a)
    println(n)
    println(x)
    println(y)
}
