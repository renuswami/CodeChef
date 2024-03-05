fun finalResult(a: Int, b: Int, c: Int): String {

    val totalScore = a+b+c
    return if(a>=10 && b>=10 && c>=10 && totalScore >= 100) "PASS" else "FAIL"
}
fun main() {
    val t = readln().toInt()
    repeat(t) {

        val (a, b, c) = readln().split(" ").map { it.toInt() }
        val finalResult = finalResult(a, b, c)
        println(finalResult)
    }
}

