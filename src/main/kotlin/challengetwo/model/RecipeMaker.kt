package main.kotlin.challengetwo.model

import main.kotlin.recipes
import kotlin.system.exitProcess

class RecipeMaker(
    recipes: MutableMap<Int, List<String>>
) : IRecipeActions {

    override fun menu() {
        val menu = """
            :: Bienvenido a Recipe Maker ::

            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()

        println(menu)
    }

    override fun choice() {
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

    override fun makeRecipe() {
        ingredientsMenu()
        println()

        var option: Int? = 0

        val ingredients = listOf(
            Food.Group.WATER.value,
            Food.Dairy.MILK.value,
            Food.MeatLegumeEgg.MEAT.value,
            Food.Vegetable.CARROT.value,
            Food.Fruit.APPLE.value,
            Food.Grain.CORN.value,
            Food.MeatLegumeEgg.EGG.value,
            Food.Group.OIL.value
        )

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
                    recipe.add(ingredients[option!!.dec()].toString())
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

    override fun ingredientsMenu() {
        val ingredientsMenu = """
            _: Ingredientes :_
    
            1. Agua
            2. Leche
            3. Carne
            4. Zanahoria
            5. Manzana
            6. Maíz
            7. Huevo
            8. Aceite
            9. Salir
        """.trimIndent()

        println(ingredientsMenu)
    }

    override fun lookRecipes() {
        recipes.forEach { (key, value) -> println("$key = $value") }
        println()
    }
}
