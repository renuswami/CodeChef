fun finalPopulation(x: Int, y: Int, z: Int): Int {
    val finalPopulation = x - y + z
    return finalPopulation
}

fun main() {
    val t = readln().toInt()
    repeat(t) {

        val (x, y, z) = readln().split(" ").map { it.toInt() }
        val finalPopulation = finalPopulation(x, y,z)
        println(finalPopulation)
    }
}

