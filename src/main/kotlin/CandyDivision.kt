fun candyDivision(n: Int): String {

    val candyDivision = n % 3
    return if(candyDivision != 0) "NO" else "YES"

}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val n = readln().toInt()
        val candys = candyDivision(n)
        println(candys)
    }

}