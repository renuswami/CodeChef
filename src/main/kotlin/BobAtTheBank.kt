fun accountBalance(w: Int, x: Int, y: Int, z: Int): Int{

    val deductedAmount   = x - y
    return  w+deductedAmount*z
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (w, x, y,z) = readln().split(" ").map{it.toInt()}
        val result = accountBalance(w, x, y, z)
        println(result)
    }
}