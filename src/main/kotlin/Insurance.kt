fun insurance(x: Int, y: Int): Int {
    return if(x<y) x else y
}
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        val amount = insurance(x, y)
        println(amount)
    }
}
