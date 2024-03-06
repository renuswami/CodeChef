fun courseRegistration(n: Int, m: Int, k: Int): String{
    return if( m>= n+k) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (n, m, k) = readln().split(" ").map{it.toInt()}
        val result = courseRegistration(n, m, k)
        println(result)
    }
}