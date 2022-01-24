package main.kotlin

import main.kotlin.model.Camera
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

    val shoe = Shoe()
    shoe.size = 34
    println(shoe.size)

    shoe.model = "Tenis"
    println(shoe.model)

}