fun minPointToWin(a: Int, b: Int): Int {
    val aliceNeeded = 7-a
    val bobNeeded = 7-b
    return minOf(aliceNeeded, bobNeeded )
}
fun main(){

    val t = readln().toInt()
    repeat(t){
        val(a, b) = readln()!!.split(" ").map{it.toInt()}
        println(minPointToWin(a, b))
    }
}