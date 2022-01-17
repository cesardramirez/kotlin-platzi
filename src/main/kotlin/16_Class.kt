package main.kotlin

import main.kotlin.model.Camera
import main.kotlin.model.NestedClassesExample

fun main() {
    val obj1 = NestedClassesExample.NestedClass().methodNested()
    println(obj1)

    val obj2 = NestedClassesExample().InnerClass().methodInner()
    println(obj2)

    println(NestedClassesExample().bar())

    println()

    val camera = Camera()
    println(camera.isOn)
    camera.turnOn()
    println("La cámara esta ${if (camera.isOn) "encendida" else "apagada"}")
    camera.turnOff()
    println("La cámara esta ${if (camera.isOn) "encendida" else "apagada"}")
}