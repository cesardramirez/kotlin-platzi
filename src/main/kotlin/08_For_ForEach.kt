package main.kotlin

import kotlin.system.measureNanoTime

fun main() {
    val daysOfWeek = listOf("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")

    // ForLoop.
    for (day in daysOfWeek) {
        print("$day \t")
    }
    println()
    // ForEach.
    daysOfWeek.forEach {
        print("$it \t")  // it: Iterador
    }

    println("\nIndices")
    // ForLoop con índices.
    for ((index, day) in daysOfWeek.withIndex()) {
        print("$index:$day \t")
    }
    println()
    // ForEach con índices.
    daysOfWeek.forEachIndexed { index, day ->
        print("$index:$day \t")  // it: Iterador
    }


    // For-loop vs ForEach

    println("\nSimple Loop")
    for (i in 0..10) { print("$i \t") }  // Variable i adicional.
    println()
    (0..10).forEach { print("$it \t") }  // Mejor opción.

    println("\nCollection")
    val list = listOf(1, 2, 3).filter { it == 2 }
    for (i in list) { print(i) }
    println()
    listOf(1, 2, 3).filter { it == 2 }.forEach { print(it) }  // Mejor opción. Es una colección iterable.

    println("\nContinue")
    for (i in 0 until 10 step 3) {  // Del 1 al 10, recorre en intervalos de 3.
        if (i == 6) continue  // Mejor opción. Si la condición se cumple, salta y sigue el ciclo.
        print("$i \t")
    }
    println()
    listOf(0, 3, 6, 9).forEach {
        if (it == 6) return@forEach
        print("$it \t")
    }

    println("\nBreak")
    for (i in 0 until 10 step 3) {
        if (i == 6) break  // Mejor opción. Cuando se cumple la condición, se rompe el ciclo y se sale completamente.
        print("$i \t")
    }
    println()
    /*listOf(0, 3, 6, 9).forEach {
        if (it == 6) return  // Pésima opción. Lo que hará es romper el código por completo. Lo que vaya después no se ejecutará.
        print("$it \t")
    }*/

    // Performance (Rendimiento)

    println("\nIntRange")
    println("ForLoop Time: " + measureNanoTime {
        for (i in 0 until 10000) { doSomething() }  // ForLoop Time: 467412. Mejor opción (para rangos).
    })
    println("ForEach Time: " + measureNanoTime {
        (0 until 10000).forEach { doSomething() }  // ForEach Time: 510866s.
    })

    println("\nList")
    val listP = (1..10000).toList()

    println("ForLoop Time: " + measureNanoTime {
        for (i in listP) { doSomething() }  // ForLoop Time: 786258
    })
    println("ForEach Time: " + measureNanoTime {
        listP.forEach { doSomething() }  // ForEach Time: 535152. Mejor opción (para cualquier colección).
    })

    println("\nSequence")
    val sequence = (1..10000).asSequence()
    println("ForLoop Time: " + measureNanoTime {
        for (i in sequence) { doSomething() }  // ForLoop Time: 863285
    })
    println("ForEach Time: " + measureNanoTime {
        sequence.forEach { doSomething() }  // ForEach Time: 799938. Mejor opción (para cualquier secuencia).
    })
}

fun doSomething() {
}
