fun main(){

    val t = readln().toInt()
    repeat(t){
        val(x, p, q) = readln().split(" ").map{it.toInt()}
        val result = (p-q)*x
        println(result)
    }
}