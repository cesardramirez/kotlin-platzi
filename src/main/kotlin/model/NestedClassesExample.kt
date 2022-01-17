package main.kotlin.model

class NestedClassesExample {

    private val bar: Int = 1

    class NestedClass {
        fun methodNested() = 2
    }

    inner class InnerClass {
        fun methodInner() = bar
    }

    fun bar(): Int {
        return bar
    }
}
