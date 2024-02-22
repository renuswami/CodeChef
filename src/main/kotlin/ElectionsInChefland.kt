fun findWinner(XA: Int, XB: Int, XC: Int): String {
    return when {
        XA > 50 -> "A"
        XB > 50 -> "B"
        XC > 50 -> "C"
        else -> "NOTA"
    }
}

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val (XA, XB, XC) = readLine()!!.split(" ").map { it.toInt() }
        println(findWinner(XA, XB, XC))
    }
}
