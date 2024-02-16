fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val (A, B, C, D, E) = readLine()!!.split(" ").map { it.toInt() }
        println(if (canTakeBags(A, B, C, D, E)) "YES" else "NO")
    }
}

fun canTakeBags(A: Int, B: Int, C: Int, D: Int, E: Int): Boolean {
    return (A + B <= D && C <= E) || (A + C <= D && B <= E) || (B + C <= D && A <= E)
}
