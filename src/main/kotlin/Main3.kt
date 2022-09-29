open class Animal (var color: String) {
    //    constructor(age:Int, c: String) : this(age) { // 주 생성자 있으면 무조건 : this() 필요
//        color = c
//    }
}

class Dog(color: String,var breed: String) : Animal(color){
    /*var breed:String = ""
    constructor(color:String,breed:String) : super(color){
        this.breed = breed
    }*/
}

/*class Dog(_color: String, var breed: String) : Animal(_color) {
    init {
        println("color = $color, bread = $breed")
    }
}*/

fun main() {
    var animal = Animal("white")
    /*var dog = Dog("br", "jindo")
    // 스코프함수
    dog.apply {
        breed = "Bulldog"
        color = "Black"
    }*/
}