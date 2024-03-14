fun determineScore(x: Int, n: Int): Int{
    val score = x/10
    return score *n
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(a, b) = readln().split(" ").map{it.toInt()}
        val result = determineScore(a, b)
        println(result)
    }
}
