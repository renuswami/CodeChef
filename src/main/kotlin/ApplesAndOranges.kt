fun main() {
    val x = readln().toInt()
    val (a, b) = readln().trim().split(" ").map { it.toInt() }
    val totalCost = a + b

    if (x >= totalCost) {
        println("YES")
    } else {
        println("NO")
    }
}
