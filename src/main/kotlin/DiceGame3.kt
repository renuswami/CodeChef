fun main() {
    val t = readln().toInt() 
    repeat(t) {
        val N = readln().toInt()
        var score = 0
        var prevRoll = 0

        repeat(N) {
            val roll = readln().toInt()
            if (prevRoll == 1) {
                score += 2 * roll
            } else {
                score += roll
            }
            prevRoll = roll
        }
        println(score)
    }
}
