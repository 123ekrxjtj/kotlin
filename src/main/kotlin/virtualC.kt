abstract class Foo {
    var s: String = "kkim"
    abstract var t: Int
    abstract fun bar()
    fun complete() {}
}

class Another : Foo() {
    override var t: Int = 10
    override fun bar() {
        println("the method is now implemented")
    }
}

fun main() {
    var bar: Foo = object : Foo() {
        override var t: Int = 17
        override fun bar() {
            println("the method is now implemented")
        }
    }
    bar.bar()
}