fun findAmountNeedToPay(x: Int): Int {
    return 100 - x
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val x = readln().toInt()
        val result = findAmountNeedToPay(x)
        println(result)
    }
}