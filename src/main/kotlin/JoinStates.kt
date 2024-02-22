fun maxStates(A: IntArray, N: Int, M: Int): Int {
    var totalLiterate = 0
    var maxStates = 0
    var currentStateLiterate = 0

    for (i in 0 until N) {
        totalLiterate += A[i]
        currentStateLiterate += A[i]
        if (currentStateLiterate >= M) {
            maxStates++
            currentStateLiterate = 0
        }
    }

    return maxStates
}

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val (N, M) = readLine()!!.split(" ").map { it.toInt() }
        val A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        println(maxStates(A, N, M))
    }
}
