fun maxPeopleCanBath(x: Int, y: Int): Int {
    val waterRequiredPerPerson = 2 * y
    return x / waterRequiredPerPerson
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        val maxPeople = maxPeopleCanBath(x, y)
        println(maxPeople)
    }
}
