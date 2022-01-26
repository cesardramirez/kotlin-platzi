package main.kotlin.model

abstract class Product(
    var name: String,
    var description: String,
    var sku: Int
) {
    override fun toString(): String {
        return "Name: $name \tDescription: $description \tSKU: $sku"
    }
}
