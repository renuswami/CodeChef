fun main() {

    val t = readln().toInt()

    repeat(t){

        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        println(x*10+y*90)
    }
}