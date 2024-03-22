fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        var sum = 0
        var num = n

        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        println(sum)
    }
}
