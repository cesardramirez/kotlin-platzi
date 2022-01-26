package main.kotlin.model

class Shoe(
    name: String,
    description: String,
    sku: Int,
    var brand: String  // Variable propia de Shoe y definida en el constructor principal.
) : Product (
    name,
    description,
    sku
), ICrudActions {  // Valores mínimos a definir para la clase.

    init {  // Apenas se instancie la clase, se va a ejecutar lo que está en init.
        println("Sku Id: $sku \tBrand: $brand")
    }

    constructor(name: String, description: String, sku: Int, brand: String, color: String) : this(name, description, sku, brand) {
        this.color = color  // Se agrega color para el constructor secundario.
    }

    override fun toString(): String {
        return super.toString() + "\tBrand: $brand \tModel: $model, \tColor: $color \tSize: $size"
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

    override fun create(): String {
        return "Create Shoe"
    }

    override fun read(): String {
        return "Read Shoe"
    }

    override fun update(): String {
        return "Update Shoe"
    }

    override fun delete(): String {
        return "Delete Shoe"
    }
}
