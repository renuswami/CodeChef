fun maximumVotes(a: Int, b: Int, c: Int): String {
    return if (a > c && a > b) "Yes" else "No"
}

fun main() {

    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val result = maximumVotes(a, b, c)
    println(result)
}


