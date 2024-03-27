fun main() {
    val t = readln().toInt()
    repeat(t) {
        var number = readln().toInt()
        val last = number % 10
        var first = 0
        while (number != 0) {
            first = number % 10
            number /= 10
        }
        val total = last + first
        println(total)
    }
}