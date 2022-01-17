package main.kotlin

fun main() {
    // Se define un lambda (anónimo) y sin parámetros.
    { println("hola mundo") }()

    // Se define un lambda (función anónima), que recibe 2 parámetros y la instrucción.
    val w = { d: Int, c: Int -> d + c }
    println(w(2, 3))

    // Se define una lambda sin usar una variable y enviando los parámetros directamente.
    // { parámetros -> instrucciones }(param1, paramN)
    println({ d: Int, c: Int -> d + c }(4, 4))

    println()

    // Ejecuta la función y almacena el valor retornado en la variable.
    val random1 = random()
    // Almacena la función en la variable sin ejecutarse.
    val random2 = { random() }

    println(random1)  // 81
    println(random2)  // () -> kotlin.Int

    // Para ejecutarla sería
    println(random2())

    val calculateNumber = { n: Int ->
        when(n) {
            in 1..3 -> println("Tu número está entre 1 y 3.")
            in 4..7 -> println("Tu número está entre 4 y 7.")
            in 8..10 -> println("Tu número está entre 8 y 10.")
            else -> println("No está en el rango.")
        }
    }

    calculateNumber(6)
}

fun random(): Int {
    return (Math.random() * 100).toInt()
}