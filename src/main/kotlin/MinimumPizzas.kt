import kotlin.math.ceil

fun minimumPizza(n: Int, x: Int): Int {
    val sliceNeeded = n * x
    return ceil(sliceNeeded.toDouble() / 4).toInt()
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (n, x) = readln().split(" ").map { it.toInt() }
        val result = minimumPizza(n, x)
        println(result)
    }
}
