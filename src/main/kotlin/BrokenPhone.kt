fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        when {
            x < y -> println("REPAIR")
            y < x -> println("NEW PHONE")
            else -> println("ANY")
        }
    }
}
