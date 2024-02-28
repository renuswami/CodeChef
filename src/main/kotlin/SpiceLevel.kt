fun spiceLevel(x: Int): String {
    if (x >= 7) {
        return "HOT"
    } else if (x in 4..6) {
        return "MEDIUM"
    } else {
        return "MILD"
    }
}

fun main() {
    val t = readLine()?.toInt() ?: 0 // Read the number of test cases
    repeat(t) {
        val x = readLine()?.toInt() ?: 0 // Read the spice level for each test case
        val result = spiceLevel(x)
        println(result)
    }
}
