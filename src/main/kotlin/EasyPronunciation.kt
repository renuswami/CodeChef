fun isEasyToPronounce(word: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var consecutiveConsonants = 0
    for (char in word) {
        if (char !in vowels) {
            consecutiveConsonants++
            if (consecutiveConsonants >= 4) {
                return "NO"
            }
        } else {
            consecutiveConsonants = 0
        }
    }
    return "YES"
}
fun main() {
    val t = readln().toInt()

    repeat(t) {
        readln().toInt()
        val word = readln()
        println(isEasyToPronounce(word))
    }
}
