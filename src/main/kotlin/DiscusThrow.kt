fun  longestDistance(a: Int, b: Int, c: Int): Int {

    val max = maxOf(a, maxOf(b, c))
    return max
}
fun main() {

    val t = readln().toInt()
    repeat(t){

        val (a, b, c) = readln().split(" ").map { it.toInt() }
        val result = longestDistance(a, b, c)
        println(result)
    }
}
