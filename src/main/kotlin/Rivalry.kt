fun findWinner(R1: Int, R2: Int, D1: Int, D2: Int): String {
    val DominaterFinalRating = R1 + D1
    val EveruleFinalRating = R2 + D2

    return if (DominaterFinalRating > EveruleFinalRating) {
        "Dominater"
    } else {
        "Everule"
    }
}

fun main() {
    val (EveruleFinalRating, R2) = readln().split(" ").map { it.toInt() }
    val (D1, D2) = readln().split(" ").map { it.toInt() }

    val winner = findWinner(EveruleFinalRating, R2, D1, D2)
    println(winner)
}
