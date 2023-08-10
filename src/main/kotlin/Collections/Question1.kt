package Collections

fun main(){
    //Question1
    val numbers = mutableListOf(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)
    numbers.sort()
    for (number in numbers){
        println(number)
    }
}