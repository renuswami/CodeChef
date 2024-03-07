fun binaryParity(n: Int): String {

    val binaryRepresentation = Integer.toBinaryString(n)
    val binarySum = binaryRepresentation.sumOf { it.toString().toInt() }
    return if (binarySum % 2 == 0) "EVEN" else "ODD"
}

fun main() {
    val numTestCases = readln().toInt()

    repeat(numTestCases) {
        val n = readln().toInt()
        println(binaryParity(n))
    }
}