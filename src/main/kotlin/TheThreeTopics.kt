fun canWinContest(a: Int, b: Int, c: Int, x: Int): String {
    return if (x == a || x == b || x == c) "Yes" else "No"
}

fun main() {
    val (a, b, c, d) = readln().split(" ").map { it.toInt() }
    val result = canWinContest(a, b, c, d)
    println(result)
}

