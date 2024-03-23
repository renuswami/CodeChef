fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (bottle1, bottle2, bottle3) = readln().split(" ").map { it.toInt() }
        if ((bottle1 == 0 && bottle2 == 0) || (bottle1 == 0 && bottle3 == 0) || (bottle2 == 0 && bottle3 == 0)) {
            println("Water filling time")
        } else {
            println("Not now")
        }
    }
}
