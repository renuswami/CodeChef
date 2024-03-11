fun calculateFinalAmount(x: Int): Int {
    return when {
        x <= 100 -> x
        x <= 1000 -> x - 25
        x <= 5000 -> x - 100
        else -> x - 500
    }
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val x = readln().toInt()
        val finalAmount = calculateFinalAmount(x)
        println(finalAmount)
    }
}
