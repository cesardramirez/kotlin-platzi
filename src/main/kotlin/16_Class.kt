package main.kotlin

import main.kotlin.model.Camera
import main.kotlin.model.Movie
import main.kotlin.model.NestedClassesExample
import main.kotlin.model.Shoe

fun main() {
    val obj1 = NestedClassesExample.NestedClass().methodNested()
    println(obj1)

    val obj2 = NestedClassesExample().InnerClass().methodInner()
    println(obj2)

    println(NestedClassesExample().bar())

    println()

    val camera = Camera()
    camera.turnOn()
    println(camera.getCameraStatus())
    camera.turnOff()
    println(camera.getCameraStatus())

    camera.setResolution(1000)
    println("Resolution: ${camera.getResolution()}")

    println()

    val shoe = Shoe("shoe", "desc 1", 12345, "Praga")
    shoe.size = 34
    println(shoe.size)
    shoe.model = "Tenis"
    println(shoe.model)
    println(shoe.sku)

    val shoe2 = Shoe("shoe", "desc 2", 7894, "Converse", "Green")
    println(shoe2.color)
    println(shoe2)
    println(shoe2.create())  // Create Shoe
    shoe2.saludar("texto")  // Método interface saludar(): texto

    println()

    val movie = Movie("Coco", "Pixar", 120)
    println(movie.toString())  // Movie(title=Coco, creator=Pixar, duration=120)
    println(movie)  // Por defecto llama al toString()
}