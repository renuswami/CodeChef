fun main() {
    val t = readln().toInt() // Read the number of test cases

    repeat(t) {
        val n = readln().toInt() // Read the number of days

        val omProblems = readln().split(" ").map { it.toInt() } // Read Om's problems
        val addyProblems = readln().split(" ").map { it.toInt() } // Read Addy's problems

        var omStreak = 0
        var addyStreak = 0
        var maxOmStreak = 0
        var maxAddyStreak = 0

        // Calculate Om's streak
        for (i in 0 until n) {
            if (omProblems[i] > 0) {
                omStreak++
                maxOmStreak = maxOf(maxOmStreak, omStreak)
            } else {
                omStreak = 0
            }
        }

        // Calculate Addy's streak
        for (i in 0..<n) {
            
            if (addyProblems[i] > 0) {
                addyStreak++
                maxAddyStreak = maxOf(maxAddyStreak, addyStreak)
            } else {
                addyStreak = 0
            }
        }

        // Compare the maximum streaks
        when {
            maxOmStreak > maxAddyStreak -> println("OM")
            maxOmStreak < maxAddyStreak -> println("ADDY")
            else -> println("DRAW")
        }
    }
}
