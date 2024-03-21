fun main() {
    val t = readln().toInt()
    repeat(t) {

        val (a, b) = readln().split(" ").map { it.toInt() }
        val remainder = a % b
        println(remainder)
    }
}
