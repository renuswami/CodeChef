import kotlin.math.abs

fun minimumTime(x: Int, y: Int): Int {

    return abs(x - y)
}
fun main() {

    val t = readln().toInt()
    repeat(t){

        val (x, y) = readln().split(" ").map { it.toInt() }
        val result = minimumTime(x, y)
        println(result)
    }
}

