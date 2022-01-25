package main.kotlin.model

data class Movie(
    val title: String,
    val creator: String,
    val duration: Int
) {
    override fun toString(): String {
        return "title: $title, creator: $creator, duration: $duration"
    }
}
