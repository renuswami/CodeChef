fun isPossibleToEraseWholeString(N: Int, S: String): String {
    // Count the frequency of each character in the string
    val freq = mutableMapOf<Char, Int>()
    for (char in S) {
        freq[char] = freq.getOrDefault(char, 0) + 1
    }

    // Check if all frequencies are even
    for (count in freq.values) {
        if (count % 2 != 0) {
            return "NO"
        }
    }
    return "YES"
}

fun main() {
    val T = readln().toInt()
    repeat(T) {
        val N = readln().toInt()
        val S = readln()
        val result = isPossibleToEraseWholeString(N, S)
        println(result)
    }
}
