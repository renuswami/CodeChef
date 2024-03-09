fun chefInHisOffice(x: Int, y: Int): Int {
    return (x * 4) + y
}
fun main() {

    val t = readln().toInt()
    repeat(t) {

        val (x, y) = readln().split(" ").map { it.toInt() }
        val  workingHours = chefInHisOffice(x, y)
        println(workingHours)
    }
}
