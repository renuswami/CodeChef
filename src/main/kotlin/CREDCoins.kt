fun calculateMaxBags(x: Int, y: Int): Int {
    return (x*y)/100
}
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        val maxBags = calculateMaxBags(x, y)
        println(maxBags)
    }
}
