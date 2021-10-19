package main.kotlin

fun main() {
    val value : String? = null
    val opc1: Int = if (value != null) value.length else -1
    val opc2: Int = value?.length ?: -1

    println(opc1)
    println(opc2)
}