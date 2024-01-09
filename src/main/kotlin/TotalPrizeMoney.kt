fun main() {

    var t = readln().toInt()

    repeat(t){

        var (x, y) = readLine()!!.split(" ").map { it.toInt() }

        println(x*10+y*90)
    }
}