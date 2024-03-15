fun scoredMarks(x: Int, y: Int): String {
    return if (x >= 2 * y) "YES" else "NO"
}

fun main() {

    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val scoredTwice = scoredMarks(x, y)
    println(scoredTwice)

}

