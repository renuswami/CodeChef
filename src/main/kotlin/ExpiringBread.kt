fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (n, m, k) = readln().split(" ").map { it.toInt() }
        val days_needed = (n + k - 1) / k
        println(if (days_needed <= m) "Yes" else "No")
    }
}
