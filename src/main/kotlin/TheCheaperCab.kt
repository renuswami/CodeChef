fun minimumAmount(x: Int, y: Int): String{
    return if(x < y) "FIRST" else if (x==y) "ANY" else "SECOND"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val result = minimumAmount(x, y)
        println(result)
    }
}