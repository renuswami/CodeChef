fun tyreProblem(x: Int, y: Int): Int {
    return (2*x)+(4*y)
}
fun main() {

    val t = readln().toInt()
    repeat(t) {

        val (x, y) = readln().split(" ").map { it.toInt() }
        val result = tyreProblem(x, y)
        println(result)
    }
}
