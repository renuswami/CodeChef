fun heightOfRationals(a: Int, b: Int): Int{
    return if(a > b) a else b
}
fun main(){

    val(a, b) = readln().split(" ").map{it.toInt()}
    val maximum = heightOfRationals(a, b)
    println(maximum)
}
