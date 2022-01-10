package main.kotlin

import kotlin.system.exitProcess

/** "Recipies Maker"
 *   - Crear recetas a partir de una lista de ingredientes previamente definidos.
 *
 *   Criterios de aceptación:
 *     - Crear un menú.
 *     - Hacer uso de:
 *        - Raw Strings.
 *        - val response : String? = readLine()
 *        - Control de flujo (if-else-when-do-while)
 *        - Break labels.
 * */

val recipes = mutableMapOf<Int, List<String>>()

fun main() {
    choice()
}

fun menu() {
    val menu = """
        :: Bienvenido a Recipe Maker ::

        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

    println(menu)
}

fun choice() {
    var option: Int? = 0

    optionError@ do {
        menu()
        print("\nSelecciona la opción deseada: ")
        val response: String? = readLine()

        try {
            option = response?.toInt()
        } catch (e: NumberFormatException) {
            println("La opción debe ser un dato numérico.")
            continue@optionError
        }

        when (option) {
            1 -> makeRecipe()
            2 -> lookRecipes()
            3 -> exitProcess(0)
            else -> {
                println("Opción inválida. Vuelva a ingresar una opción correcta.")
            }
        }
    } while (option != 3)
}

fun ingredientsMenu() {
    val ingredientsMenu = """
        _: Ingredientes :_

        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        9. Salir
    """.trimIndent()

    println(ingredientsMenu)
}

fun makeRecipe() {
    ingredientsMenu()
    println()

    var option: Int? = 0
    val ingredients = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    val recipe: MutableList<String> = mutableListOf()

    optionError@ do {
        print("Selecciona la opción deseada: ")
        val response: String? = readLine()

        try {
            option = response?.toInt()
        } catch (e: NumberFormatException) {
            println("La opción debe ser un dato numérico.")
            continue@optionError
        }

        when (option) {
            in 1..8 -> {
                recipe.add(ingredients[option!!.dec()])
            }
            9 -> {
                recipes[recipes.size] = recipe
                break
            }
            else -> {
                println("Opción inválida. Vuelva a ingresar una opción correcta.")
            }
        }
    } while (option != 9)
}

fun lookRecipes() {
    recipes.forEach { (key, value) -> println("$key = $value") }
    println()
}
