package main.kotlin.model

class Shoe(var sku: Int, var mark: String) {  // Valores mínimos a definir para la clase.

    init {  // Apenas se instancie la clase, se va a ejecutar lo que está en init.
        println("Sku Id: $sku \tMark: $mark")
    }

    constructor(sku: Int, mark: String, color: String) : this(sku, mark) {
        this.color = color
    }

    var size: Int = 34
        set(value) {
            if (value >= 34)
                field = value  // field hace referencia al valor de size.
            else
                field = 34
        }
        get() = field + 1

    var color: String = "White"

    var model: String = "Boots"
        set(value) {
            if (value == "Tenis")
                field = "Boots"
            else
                field = value  // field hace referencia al valor de model.
        }
        get() = field  // Indica que es redundante, ya que no se está haciendo cambios a la variable.
}
