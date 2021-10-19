package main.kotlin

fun main() {
    val dato : Int? = null  // null como valor por defecto.
    val msg: String? = null  // El ? es necesario para inicializar un valor en nulo.

    // Saldrá error en el IDE si no se coloca el ? ó !!, lo cuál el IDE mostrará las posibles opciones para validar el dato.

    val numero : Int? = null
    // Antes.
    if (numero != null) {  // No ingresa y no realiza la operación.
        println(numero.div(2))
    }
    // Ahora
    println(numero?.div(2))  // No realiza la operación y por defecto imprime el valor null.

    val listWithNulls: List<String?> = listOf("Kotlin", null, "Yeih", null)
    for (item in listWithNulls) {
        item?.let { print("$it \t") }  // Imprime sólo los valores no nulos.
    }
    println()
    println(listWithNulls.filterNotNull())  // [Kotlin, Yeih]

    println()
    println(dato?.inc())  // Si el valor es null, cualquier método adicional que se llame (por defecto) su resultado será null.
    println(msg!!.length)  // Si el valor es null, forzará a que se lance la excepción, en este caso, un NPE.
}