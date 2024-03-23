fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val referees = readLine()!!.split(" ").map { it.toInt() }
        val isIn = referees.all { it == 0 }
        val status = if (isIn) "IN" else "OUT"
        println(status)
    }
}
