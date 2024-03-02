fun findFundNeeded(x: Int, n: Int, m: Int): String {
    val totalAmount = x + m
    return if(totalAmount >= n) "YES" else "NO"
}

fun main(){
    val(x, n, m) = readln().split(" ").map{it.toInt()}
    val result = findFundNeeded(x, n, m)
    println(result)
}