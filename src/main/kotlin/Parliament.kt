fun resolutionPassed(n: Int, x: Int): String {
    return if (x*2 >= n) "YES" else "NO"
}
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (n, x) = readln().split(" ").map { it.toInt() }
        println(resolutionPassed(n, x))
    }
}
