package main.kotlin

fun main() {
    // Short : [-32768, 32767]
    val num1 : Short = 32767
    val num2 : Short = 32768.toShort()
    println("num1: $num1 num2: $num2")  // num1: 32767 num2: -32768

    val oneToHundred : IntRange = 1..10
    for (i in oneToHundred) print("$i \t")  //	1	2	3	4	5	6	7	8	9	10
    println()
    for (i in 10 downTo 1) print("$i \t")  //	10	9	8	7	6	5	4	3	2	1
    println()
    println(oneToHundred.elementAt(5))  // 6

    val AtoG = 'A'..'G'
    for (i in AtoG) print("$i \t")  //	A	B	C	D	E	F	G
}
