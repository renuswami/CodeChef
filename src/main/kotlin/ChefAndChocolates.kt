fun findMaxChocolates(x: Int, y: Int, z: Int): Int{

    val rupeesInTotal = x*5 + y*10
    return rupeesInTotal / z
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y, z) = readln().split(" ").map{it.toInt()}
        val maxChocolates = findMaxChocolates(x, y, z)
        println(maxChocolates)
    }
}