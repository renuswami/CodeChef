fun isChefHappy(n: Int, m: Int): String {
    return if (n < m) "YES" else "NO"
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    println(isChefHappy(n, m))
}
