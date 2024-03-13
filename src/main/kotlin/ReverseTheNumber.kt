fun reverseNumber(n: Int): Int {
    val reversedString = n.toString().reversed()
    return reversedString.toInt()
}

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val reversedNumber = reverseNumber(n)
        println(reversedNumber)
    }
}
