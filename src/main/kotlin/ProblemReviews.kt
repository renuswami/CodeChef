fun isProblemGood(scores: List<Int>): String {
    for (score in scores) {
        if (score <= 4) {
            return "NO"
        }
    }
    return "YES"
}
fun main() {
    val t = readln().toInt() // Input number of test cases

    repeat(t) {
        readln().toInt() // Input number of judges
        val scores = readln().split(" ").map { it.toInt() } // Input scores

        // Check if the problem is good and print the result
        println(isProblemGood(scores))
    }
}
