fun main() {

    var t = readln().toInt()

    repeat(t){

        val (k, x) = readLine()!!.split(" ").map { it.toInt() }


        println(k*7-x)
    }
}