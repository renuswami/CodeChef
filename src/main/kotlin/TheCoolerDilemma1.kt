fun shouldRentCooler(rentCost: Int, purchaseCost: Int, months: Int): String {
    val totalRentCost = rentCost * months
    return if (totalRentCost < purchaseCost) "YES" else "NO"
}
fun main() {
    val testCases = readln().toInt()

    repeat(testCases) {
        val (rentCost, purchaseCost, months) = readLine()!!.split(" ").map { it.toInt() }
        val result = shouldRentCooler(rentCost, purchaseCost, months)
        println(result)
    }
}
