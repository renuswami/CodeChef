fun main() {

    val t = readLine()!!.toInt()
    repeat(t) {

        val (p, l) = readLine()!!.split(" ").map { it.toInt() }
        val literacyRate = (l.toDouble() / p) * 100

        if (literacyRate >= 75) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
