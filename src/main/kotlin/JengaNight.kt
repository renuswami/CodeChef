fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (n, x) = readln().split(" ").map { it.toInt() }
        val rounds = x / n
        val isValid = if (rounds * n == x) "YES" else "NO"
        println(isValid)
    }
}
