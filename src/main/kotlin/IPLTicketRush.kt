fun determineTicket(n: Int, m: Int): Int{

    return if(n<=m) 0 else n-m
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val(n, m) = readln().split(" ").map{it.toInt()}
        val result = determineTicket(n, m)
        println(result)
    }
}
