fun main() {

    val (a, b, x, y) = readln().split(" ").map { it.toInt() }

    val messiGoals = a * 2 + b
    val ronaldoGoals = x * 2 + y

    if (ronaldoGoals > messiGoals) {
        println("Ronaldo")
    } else if (messiGoals > ronaldoGoals) {
        println("Messi")
    } else {
        println("Equal")
    }
}