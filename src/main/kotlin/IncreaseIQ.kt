fun checkIQ(x: Int): String{
    return if(170 < x+7) "YES" else "NO"
}
fun main(){
    val x = readln().toInt()
    val iq = checkIQ(x)
    println(iq)
}