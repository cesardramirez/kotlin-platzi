package main.kotlin.challengetwo.model

abstract class Food(
    var group: Group
) {
    enum class Group(val value: String) {
        DAIRY("Lacteo"),
        MEAT_LEGUME_EGG("Carne, Legumbre y Huevo"),
        GRAIN("Grano"),
        OIL("Aceite"),
        VEGETABLE("Vegetal"),
        FRUIT("Fruta"),
        WATER("Agua")
    }

    enum class Dairy(val value: String) {
        MILK("Leche")
    }

    enum class MeatLegumeEgg(val value: String) {
        EGG("Huevo"),
        MEAT("Carne")
    }

    enum class Grain(val value: String) {
        OATMEAL("Avena"),
        WHEAT("Trigo"),
        RICE("Arroz"),
        CORN("Maíz")
    }

    enum class Vegetable(val value: String) {
        CARROT("Zanahoria"),
        BROCCOLI("Brócoli")
    }

    enum class Fruit(val value: String) {
        STRAWBERRY("Fresa"),
        PLANTAIN("Plátano"),
        GRAPE("Uva"),
        APPLE("Manzana"),
        ORANGE("Naranja"),
        PEAR("Pera"),
        CHERRY("Cereza")
    }
}
