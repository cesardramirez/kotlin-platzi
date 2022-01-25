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

    val shoe = Shoe(12345, "Praga")
    shoe.size = 34
    println(shoe.size)
    shoe.model = "Tenis"
    println(shoe.model)
    println(shoe.sku)
    println(shoe.mark)

    val shoe2 = Shoe(7894, "Converse", "Green")
    println(shoe2.color)

    println()

    val movie = Movie("Coco", "Pixar", 120)
    println(movie.toString())  // Movie(title=Coco, creator=Pixar, duration=120)

}