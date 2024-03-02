fun needToPay(x: Int): Int{
    val coinsNeeded = x % 10
    return coinsNeeded
}
fun main(){
    val t = readln().toInt()

    repeat(t){
        val x = readln().toInt()
        val result = needToPay(x)
        println(result)
    }
}