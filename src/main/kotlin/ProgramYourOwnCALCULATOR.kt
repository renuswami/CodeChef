fun main() {

    val A = readln().toDouble()
    val B = readln().toDouble()
    val operator = readlnOrNull()

    val result = when (operator) {
        "+" -> A + B
        "-" -> A - B
        "*" -> A * B
        "/" -> {
            if (B != 0.0) {
                A / B
            } else {
                return
            }
        }
        else -> {
            return
        }
    }
    println(result)
}
