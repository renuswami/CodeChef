fun isExpert(x: Int, y: Int): String {
    val approvalPercentage = (y.toDouble() / x.toDouble()) * 100
    return if (approvalPercentage >= 50) "YES" else "NO"
}
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        println(isExpert(x, y))
    }
}
