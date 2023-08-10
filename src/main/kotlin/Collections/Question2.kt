package Collections

fun main(){
    //Question2
    val group1 = arrayOf("a","b", "e", "d", "c" )

    val group2 = arrayOf("ant", "bee", "elephant", "dog", "cat")


    val mapNumber = mutableMapOf<String, String>()
        .apply { for (i in group1.indices) this[group1[i]] = group2[i] }
    println(mapNumber)
}