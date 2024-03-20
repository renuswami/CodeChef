fun maximiseTheTastiness(a: Int, b: Int, c: Int, d :Int): Int {

    val max = maxOf(a, b) + maxOf(c, d)
    return max
}

fun main() {

    val t = readln().toInt()
    repeat(t){

        val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
        val result = maximiseTheTastiness(a, b, c, d)
        println(result)
    }
}

