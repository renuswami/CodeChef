fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (a, b, x, y) = readln().split(" ").map { it.toInt() }
        val powerNeeded = a * b
        val powerProvided = x * y
        val answer = if (powerProvided >= powerNeeded) "Yes" else "No"
        println(answer)
    }
}
