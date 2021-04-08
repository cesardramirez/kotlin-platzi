// Variables globales.
var x = 7  // Mala práctica, las variables mutables deberian definirse y modificarse dentro de las funciones.
const val y = 8  // Buenas prácticas. Variable inmutable que se define en tiempo de compilación.

fun main(args: Array<String>) {
    val a = 4  // Variables inmutables.
    val b = 2
    var n = 3 // EL IDE indica que La variable nunca se modifica (inmutable) y se puede declarar usando 'val'.

    x = 5

    val name = args[0]  // Variable inmutable que se define en tiempo de ejecución.
    println(name)

    println(a)
    println(n)
    println(x)
    println(y)
}