import kotlin.math.sqrt

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val squareRoot = sqrt(n.toDouble()).toInt()
        println(squareRoot)
    }
}
