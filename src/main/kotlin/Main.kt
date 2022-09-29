class Person constructor(
    var name: String,
    var age: Int,
    var isMarried: Boolean
) { //  primary constructor defined outside class body
    /*
    var name:String = ""
    var age:Int = -1
    var isMarried:Boolean = false

     */
    var nickName: String = ""

    init {
        println("Begin Init block")
        println("name = $name, age = $age, isMarried = $isMarried")
        println("End Init block")
    }

    constructor(_name: String, _age: Int, b: Boolean, k: String) : this(_name, _age, b) {
        this.nickName = k
        println("I am here")
    }

    fun getName() = println(name)
}

fun main() {
    var hong = Person("Park", 19, true, "Chic")
    println(hong.name)
}