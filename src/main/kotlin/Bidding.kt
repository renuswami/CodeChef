fun main() {

    val t = readLine()!!.toInt()

    repeat(t) {

        val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

        if (a > b) {

            if (a > c) {
                println("Alice")
            } else {
                println("Charlie")
            }

        } else {
            if (b > c) {
                println("Bob")
            } else {
                println("Charlie")
            }
        }
    }
}
