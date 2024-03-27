fun dominantArmy(a: Int, b: Int, c: Int): String{

    return if(a+b < c || b+c < a || a+c < b) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (a, b, c) = readln().split(" ").map{it.toInt()}
        val result = dominantArmy(a, b, c)
        println(result)
    }
}