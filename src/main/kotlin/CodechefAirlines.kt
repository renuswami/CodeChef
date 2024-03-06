fun findMaximumAmount(x: Int, y: Int, z: Int): Int{

    return if(10*x >= y){
        y*z
    }else{
        10*x*z
    }
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y,z) = readln().split(" ").map{it.toInt()}
        val result = findMaximumAmount(x, y, z)
        println(result)
    }
}