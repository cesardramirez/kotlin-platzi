package main.kotlin.challengetwo

import main.kotlin.challengetwo.model.RecipeMaker

fun main() {

    val recipes = mutableMapOf<Int, List<String>>()

    val recipesMaker = RecipeMaker(recipes)

    recipesMaker.choice()
}