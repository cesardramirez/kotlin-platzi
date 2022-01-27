package main.kotlin

fun main() {
    val numbersInt = listOf(4, 3, 2)
    val mylist = listOf(4, "lala", "ll", 2)
    val words = listOf("Oasis", "Hola", "Holanda", "Objeto")

    val months = hashMapOf(
        "Enero" to 1,
        "Febrero" to 2,
        "Marzo" to 3,
        "Abril" to 4,
        "Mayo" to 5,
        "Junio" to 6,
        "Julio" to 7,
        "Agosto" to 8,
        "Septiembre" to 9,
        "Octubre" to 10,
        "Noviembre" to 11,
        "Diciembre" to 12
    )

    println(months["Enero"])

    val sorted = months.toList()
        .sortedBy { (key, value) -> value }
        .toMap()

    println(sorted)  // {Enero=1, Febrero=2, Marzo=3, Abril=4, Mayo=5, Junio=6, Julio=7, Agosto=8, Septiembre=9, Octubre=10, Noviembre=11, Diciembre=12}

    println(numbersInt.filter { it % 2 == 0 })  // [4, 2]
    println(words.filter { it.startsWith('O') })  // [Oasis, Objeto]
    println(words.filter { it.contains("la") })  // [Hola, Holanda]

    val regex = Regex("H.*a")
    println(words.filter { it.matches(regex) })  // [Hola, Holanda]
}
