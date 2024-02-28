fun minRoomsNeeded(N: Int, A: List<Int>): Int {
    var totalRooms = 0
    for (num in A) {
        totalRooms += (num + 1) / 2
    }
    return totalRooms
}

fun main() {
    val T = readLine()!!.toInt()

    repeat(T) {
        val N = readLine()!!.toInt()
        val A = readLine()!!.split(" ").map { it.toInt() }

        println(minRoomsNeeded(N, A))
    }
}
