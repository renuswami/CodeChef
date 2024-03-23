fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (n, x) = readln().split(" ").map { it.toInt() }
        val totalBill = n * x
        val isValidPhoneNumber = totalBill.toString().length == 5 && !totalBill.toString().startsWith('0')
        val answer = if (isValidPhoneNumber) "YES" else "NO"
        println(answer)
    }
}
