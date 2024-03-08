fun netflix(a: Int, b: Int, c: Int, x: Int): String{
    return if(a+b >= x || a+c >= x || b+c >= x) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (a, b, c, x) = readln().split(" ").map{it.toInt()}
        val result = netflix(a, b, c, x)
        println(result)
    }
}