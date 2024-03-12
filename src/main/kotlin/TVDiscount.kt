fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (a, b, c, d) = readln().split(" ").map { it.toInt() }

        val costAfterDiscountA = a - c
        val costAfterDiscountB = b - d

        when {
            costAfterDiscountA < costAfterDiscountB -> println("First")
            costAfterDiscountB < costAfterDiscountA -> println("Second")
            else -> println("Any")
        }
    }
}
