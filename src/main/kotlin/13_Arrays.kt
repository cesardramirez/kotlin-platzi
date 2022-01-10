package main.kotlin

fun main() {
    val countries = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Peru")
    val days = arrayListOf<String>("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")

    // Arreglo de datos : primitivos.
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    // Arreglo de datos : objetos (Int).
    var numbersObject = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    var numbersPrimitive: IntArray = numbersObject.toIntArray()

    print("Números:\t")
    var sumPrimitive = 0
    for (num in numbers) {
        print("$num \t")
        sumPrimitive += num
    }

    val average = sumPrimitive / numbers.size
    println("\nPromedio: $average")

    // Añadir un valor al arreglo.
    numbersObject = numbersObject.plus(15)

    val sumObjects = numbersObject.sum()
    println("Promedio: ${sumObjects / numbersObject.size}")

    // Arreglo con los datos al revés y lo asignamos a la misma variable.
    numbersObject = numbersObject.reversedArray()
    print("Números:\t")
    numbersObject.forEach { print("$it \t") }

    println()

    // Arreglo con los datos al revés y lo hace así mismo (sin necesidad de asignarlo a la misma variable).
    numbersObject.reverse()
    print("Números:\t")
    numbersObject.forEach { print("$it \t") }
}
