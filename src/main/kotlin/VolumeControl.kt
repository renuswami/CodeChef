import kotlin.math.abs
fun volumeUp(x: Int, y: Int): Int{

    val minimumPresses = y-x
    return abs(minimumPresses)
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val finalVolume = volumeUp(x, y)
        println(finalVolume)
    }
}