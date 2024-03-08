fun cricketMatch(n: Int, m: Int): String{

    val maxBalls = m * 6
    val runs = maxBalls * 6
    return if(n <= runs) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(n, m) = readln().split(" ").map{it.toInt()}
        val winMatch = cricketMatch(n, m)
        println(winMatch)
    }
}