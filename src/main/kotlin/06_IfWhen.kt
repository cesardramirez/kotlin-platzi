package main.kotlin

fun main() {
    val num = 10

    if (num == 2) print("Son iguales.") else print("Son diferentes.")

    println()

    // Cuando la condición se cumple, se sale del ciclo.
    when (num) {
        in 1..5 -> println("El número se encuentra entre el 1 y el 5.")
        in 6..7 -> println("El número se encuentra entre el 6 y el 7.")
        !in 11..15 -> println("El número NO se encuentra entre el 11 y el 15.")
        else -> println("El número no se encuentra entre los rangos condicionados.")
    }

    println()

    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

    println(describe(1))
    println(describe("Hello"))
    println(describe(5L))
    println(describe(7))
    println(describe("texto"))
}
