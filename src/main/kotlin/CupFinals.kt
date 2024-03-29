fun isInteresting(x: Int, y: Int, d: Int): String {
    val skillDifference = Math.abs(x - y)
    return if (skillDifference <= d) {
        "YES"
    } else {
        "NO"
    }
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (x, y, d) = readln().split(" ").map { it.toInt() }
        val result = isInteresting(x, y, d)
        println(result)
    }
}
