fun main() {
    val t = readln().toInt()

    repeat(t) {
        val referees = readln().split(" ").map { it.toInt() }
        val isIn = referees.all { it == 0 }
        val status = if (isIn) "IN" else "OUT"
        println(status)
    }
}
