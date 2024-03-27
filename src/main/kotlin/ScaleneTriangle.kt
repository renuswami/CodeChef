fun scaleneTriangle(a: Int, b: Int, c: Int): String {
    return if(a == b || a==c || b==c) "No" else "Yes"
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        val result = scaleneTriangle(a, b, c)
        println(result)
    }
}
