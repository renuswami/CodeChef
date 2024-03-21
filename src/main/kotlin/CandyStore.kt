fun totalAmount(x: Int, y: Int): Int{

    return if(y > x) x+((y-x)*2) else y
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val result = totalAmount(x, y)
        println(result)
    }
}