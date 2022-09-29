interface Clickable {
    fun click()
    fun showOff() = println("Clickable")
}

interface Focusable{
    fun focus()= println("focus")
    fun showOff()= println("Clickable2")
}

class Button : Clickable{
    override fun click() {
        println("click ")
    }
}

fun main(){
    var bt = object : Clickable,Focusable{
        override fun click() {
            println("click ")
        }

        override fun showOff() {
            super<Clickable>.showOff()
            super<Focusable>.showOff()
        }
    }
    bt.click()
    bt.showOff()
}