fun maximiseTheTastiness(a: Int, b: Int, c: Int, d: Int): Int {

    return maxOf(a, b) + maxOf(c, d)
}

fun main() {

    val t = readln().toInt()
    repeat(t){

        val (a, b, c, d) = readln().split(" ").map { it.toInt() }
        val result = maximiseTheTastiness(a, b, c, d)
        println(result)
    }
}

