fun totalMinutes(x: Int, y: Int): Int {

    val usualSpeed = y/2
    return x - usualSpeed
}
fun main() {

    val (x, y) = readln().split(" ").map { it.toInt() }
    val result = totalMinutes(x, y)
    println(result)

}

