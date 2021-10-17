package main.kotlin

fun main() {
    val nombre = "Cesar"
    val apellido: String = "Ramírez"  // Definición explícita (String)
    val edad: Int = 32

    println("Tu nombre es $nombre $apellido y tu \"edad\" es $edad años\n")

    /* Raw String
      trimIndent() : Respeta los saltos de línea escritos en el párrafo.
      trimMargin() : Elimina un patrón específico de un párrafo.
    */
    val parrafo = """
        ** Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        ** Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
        ** when an unknown printer took a galley of type and scrambled it to make a type
        ** specimen book. It has survived not only five centuries, but also the leap into
        ** electronic typesetting, remaining essentially unchanged.
        ** It was popularised in the 1960s with the release of Letraset sheets containing
        ** Lorem Ipsum passages, and more recently with desktop publishing software like Aldus
        ** PageMaker including versions of Lorem Ipsum.
    """.trimIndent()

    println(parrafo.trimMargin("** "))
//    println(parrafo.trimMargin(marginPrefix = "** "))
}
