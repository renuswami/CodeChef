import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {

    return if (num <= 1) {
        false
    } else{

        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}

fun hackerman(a: Int, b: Int): String {
    val primeNumber = a+b
    return if(isPrime(primeNumber)) "Alice" else "Bob"
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val result = hackerman(a, b)
        println(result)
    }
}
