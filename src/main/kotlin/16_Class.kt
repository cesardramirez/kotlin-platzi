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
    camera.turnOn()
    println(camera.cameraStatus())
    camera.turnOff()
    println(camera.cameraStatus())
}