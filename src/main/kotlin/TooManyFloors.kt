import kotlin.math.abs

fun numberOfFloors(x: Int, y: Int): Int{

    val ans = (((x-1)/10)+1) - (((y-1)/10)+1)
    return abs(ans)
}
fun main(){

    val t =  readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val result = numberOfFloors(x, y)
        println(result)
    }
}