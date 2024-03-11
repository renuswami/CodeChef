import kotlin.math.ceil

fun minimumCandy(n: Int, x: Int): Int {

    val candysNeeded = n - x
    return if(candysNeeded <=0){
        0
    }else{
        ceil(candysNeeded.toDouble() / 4).toInt()
    }
}
fun main() {

    val t = readln().toInt()
    repeat(t) {

        val (n, x) = readln().split(" ").map { it.toInt() }
        val result = minimumCandy(n, x)
        println(result)
    }
}
