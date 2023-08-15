package Classes

open class Color( var name:String, var symbol:String, var hexCode:String){
    open fun showColorDetails(){
        println("The color is $name, its symbol is $symbol and the hex code is $hexCode")
    }
}

class Rainbow(name: String, symbol: String, hexCode: String):Color(name,symbol,hexCode){
    override fun showColorDetails() {
        println("The colors of the Rainbow are : Red, orange, yellow, green, blue, indigo, violet.")
    }
}

fun main(){
    val color = Color("Sadolin", "£", "#FFF")

    color.showColorDetails()

    val rainbow = Rainbow("Red", "&&", "#FOO")
    rainbow.showColorDetails()
}