fun creditScore(x: Int): String{

    return if(x >= 750) "YES" else "NO"
}
fun main(){

    val x = readln().toInt()
    println(creditScore(x))
}