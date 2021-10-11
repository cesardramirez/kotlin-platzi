package main.kotlin

fun main() {
    // Datos Tipo Primitivos
    println(1 + 1)
    println(3 - 1)
    println(2 * 2)
    println(4 / 2)
    println(7 % 2)
    println()

    // Kotlin : Variable tratada como Objeto
    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))

    val c = -2
    val d = c.unaryMinus()
    println("d: $d")  // Cambia el signo.

    val e = true
    val f = e.not()
    println("f: $f")  // Cambia el booleano.

    val g = 6
    val h = 5
    println("a es mayor que b : ${a.compareTo(b) > 0}")
    println("a es mayor que b : ${a > b}")
    println()

    val mapOne = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    val mapTwo = mutableMapOf(4 to "D", 5 to "Lo que sigue luego de la D")

    println("mapOne : ".plus(mapOne))
    println("mapOne : ".plus(mapTwo))
    mapOne.plusAssign(mapTwo)
    println("mapOneTwo : ".plus(mapOne))
}
