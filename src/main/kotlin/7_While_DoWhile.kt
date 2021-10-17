package main.kotlin

fun main() {
    var i = 1

    while (i < 1) {  // No ingresa
        print("$i \t")
        i = i.inc()
    }

    println()
    i = 1
    do {  // Ingresa
        print("$i \t")
        i = i.inc()
    } while (i < 1)
}