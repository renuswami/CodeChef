fun janmanshAndCoins(x: Int, y: Int): Int {
    return (x*10)+(y*5)
}
fun main() {

    val t = readln().toInt()
    repeat(t) {

        val (x, y) = readln().split(" ").map { it.toInt() }
        val  totalRupees = janmanshAndCoins(x, y)
        println(totalRupees)
    }
}
