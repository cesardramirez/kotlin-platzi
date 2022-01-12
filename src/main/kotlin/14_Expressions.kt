package main.kotlin

import kotlin.math.sqrt

fun main() {
    var x = 5
    println("¿x es igual a 5? : ${x == 5}")

    val message = "El valor de x es $x"
    x++
    println("${message.replace("es", "fue")}, x es ahora: $x")

    val y = 4.0
    println("Raiz cuadrada de $y es ${sqrt(y)}")

    val numbers = intArrayOf(6, 6, 23, 9, 2, 3, 2)
    println("El promedio de los números es: ${averageNumbers(numbers)}")

    println(evaluate('+', 2))
    println(evaluate(number = 5, character = '-'))
}

fun evaluate(character : Char = '=', number: Int = 2): String {
    return "$number es $character"
}

fun averageNumbers(numbers: IntArray): Int {
    return numbers.sum().div(numbers.size)
}