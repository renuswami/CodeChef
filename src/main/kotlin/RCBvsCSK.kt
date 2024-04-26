fun main() {

    val (x, y) = readln().split(' ').map { it.toInt() }

    if (x - y >= 18) {
        println("RCB")
    } else {
        println("CSK")
    }
}