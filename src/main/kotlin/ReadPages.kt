fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (n, x, y) = readln().split(" ").map { it.toInt() }

        if (x.toLong() * y.toLong() >= n.toLong()) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
