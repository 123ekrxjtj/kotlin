/*
open class Animal {
    open var color: String = ""
    open fun eat() = println("Eat")
}

class Dog : Animal() {  //  single inheritance
    //  interface는 괄호 없음
    var breed: String = ""

    override var color: String = "Brown"

    fun bark() = println("Bark")
    override fun eat() {
        super.eat()
        println("My dog enjoys a snack")
    }
}

class Cat : Animal() {
    var age: Int = -1
    fun meow() = println("Meow")
    override fun eat() {
        super.eat()
        println("MylovelyCat eats a  food")
    }
}

fun main() {
    var dog = Dog()
    // 스코프함수
    dog.apply { // with (dog) // with, let, apply ...
        breed = "Bulldog"
        color = "Black"
        bark()
        eat()
    }

    var cat = Cat()
    with(cat) {
        age = 2
        color = "white"
        meow()
        eat()
    }

    println("age = ${cat.age}, color = ${cat.color} ")

}

 */