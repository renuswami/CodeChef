fun main() {
    val x = readLine()!!.toInt()
    val (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }
    val totalCost = a + b

    if (x >= totalCost) {
        println("YES")
    } else {
        println("NO")
    }
}
