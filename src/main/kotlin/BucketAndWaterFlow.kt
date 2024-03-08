fun bucketAndWaterFlow(w: Int, x: Int, y: Int, z: Int): String {
    val finalWaterLevel = w + (y * z)

    return if (finalWaterLevel > x) "overflow" else if (finalWaterLevel == x) "filled" else "unfilled"
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (w, x, y, z) = readln().split(" ").map { it.toInt() }
        val result = bucketAndWaterFlow(w, x, y, z)
        println(result)
    }
}