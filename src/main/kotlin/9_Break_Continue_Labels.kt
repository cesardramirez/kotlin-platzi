package main.kotlin

fun main() {
    /*
    // Break
    println("\nBreak")
    """ El primer ciclo lo hará 3 veces.
        El segundo ciclo lo 'hará' 5 veces, pero en realidad lo hará hasta que el valor de j sea igual 2.
        Cuando j sea 3, se sale del segundo ciclo por completo.
    """.trimIndent()
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j == 3) break
            println("j: $j")
        }
    }

    println("\nContinue")
    """ El primer ciclo lo hará 3 veces.
        El segundo ciclo lo 'hará' 5 veces, pero en realidad saltará una vez.
        Cuando j sea 3, salta la opción pero sigue en el segundo ciclo hasta terminar.
    """.trimIndent()
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j == 3) continue
            println("j: $j")
        }
    }

    // Break y Label
    println("\nBreak sin Label")
    """ El primer y segundo ciclo lo hará 3 veces.
        El tercer ciclo lo 'hará' 5 veces, pero en realidad lo hará hasta que el valor de k sea igual 2.
        Cuando k sea 3, se sale del tercer ciclo por completo.
    """.trimIndent()
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k == 3) break
                println("k: $k")
            }
        }
    }

    println("\nBreak con Label")
    """ El primer y segundo ciclo lo 'hará' 3 veces.
        El tercer ciclo lo 'hará' 5 veces, pero en realidad lo hará hasta que el valor de k sea igual 2.
        Cuando k sea 3, se va hasta donde fue definido el label, en este caso, al inicio (antes de definirse los 3 ciclos).
        Por lo tanto, terminará todos los ciclos (por ser break).
    """.trimIndent()
    terminarTodosLosCiclos@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k == 3) break@terminarTodosLosCiclos
                println("k: $k")
            }
        }
    }

    // Continue y Label
    println("\nContinue sin Label")
    """ El primer y segundo ciclo lo hará 3 veces.
        El tercer ciclo lo 'hará' 5 veces, pero en realidad saltará una vez.
        Cuando k sea 3, salta la opción pero sigue en el tercer ciclo hasta terminar (Solamente salta y no imprime cuando k=3).        
    """.trimIndent()
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k == 3) continue
                println("k: $k")
            }
        }
    }

    println("\nContinue con Label")
    """ El primer ciclo lo hará 3 veces. El segundo ciclo lo hará sólo 1 vez por cada primer ciclo. 
        El tercer ciclo lo 'hará' 5 veces, pero en realidad lo hará hasta que el valor de k sea igual 2.
        Cuando k sea 3, se va hasta donde fue definido el label, en este caso, al inicio (antes de definirse los 3 ciclos).
        Por lo tanto, volverá al primer ciclo y continuará con los demás ciclos (por ser continue).
    """.trimIndent()
    continuarEn@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k == 3) continue@continuarEn
                println("k: $k")
            }
        }
    }
    */

    // Esto es lo mismo...
    nombre@ for (i in 1..3) {
        println("i: $i")
        for (j in 1..5) {
            if (j == 3) continue@nombre
            println("j: $j")
        }
    }
    println()
    // ... que esto.
    for (i in 1..3) {
        println("i: $i")
        for (j in 1..5) {
            if (j == 3) break
            println("j: $j")
        }
    }
}
