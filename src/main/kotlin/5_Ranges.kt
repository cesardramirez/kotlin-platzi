fun main() {
    val oneToHundred : IntRange = 1..10
    // 1 	2 	3 	4 	5 	6 	7 	8 	9 	10
    for (i in oneToHundred) print("$i \t")

    println()

    val AtoG = 'A'..'G'
    // A 	B 	C 	D 	E 	F 	G
    for (i in AtoG) print("$i \t")

    println()

    // 10 	9 	8 	7 	6 	5 	4 	3 	2 	1
    for (i in 10 downTo 1) print("$i \t")

    println()
    println(oneToHundred.elementAt(5))
}
