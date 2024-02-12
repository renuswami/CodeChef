import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val T = scanner.nextInt()

    repeat(T) {
        val N = scanner.nextLong()
        val M = scanner.nextLong()
        val result = maxContestants(N, M)
        println(result)
    }
    scanner.close()
}

fun maxContestants(apples: Long, oranges: Long): Long {
    return gcd(apples, oranges)
}

fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}
