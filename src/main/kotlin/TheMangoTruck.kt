fun maxMangoes(t: Int, testCases: List<Triple<Int, Int, Int>>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0 until t) {
        val (x, y, z) = testCases[i]
        val maxMango = (z - y) / x
        result.add(maxMango)
    }
    return result
}

fun main() {
    val t = readLine()!!.toInt()
    val testCases = mutableListOf<Triple<Int, Int, Int>>()
    repeat(t) {
        val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
        testCases.add(Triple(x, y, z))
    }

    val output = maxMangoes(t, testCases)
    for (ans in output) {
        println(ans)
    }
}
