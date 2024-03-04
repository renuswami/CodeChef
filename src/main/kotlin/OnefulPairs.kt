fun isOnefulPair(a: Int, b:Int): String{
    return if (a+b+(a*b) == 111) "YES" else "NO"
}
fun main(){
    val(x, y) = readln().split(" ").map{it.toInt()}
    val result = isOnefulPair(x, y)
    println(result)
}