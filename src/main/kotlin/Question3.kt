fun main(){
    /*
     In a class, there are five students; Ivan, Aron,Grace, Nisah and Christine
     create an array in this order and after wards, print the result in alphabetical order
     */

    val names = mutableListOf("Ivan", "Aron", "Grace","Nisah","Christine" )
    names.sort()
    println("names: $names")
}