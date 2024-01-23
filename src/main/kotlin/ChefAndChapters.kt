fun main(){

    val t = readln().toInt()

    repeat(t){
        val (x, y, z) = readln().split(" ").map{it.toInt()}
        println(x*y*z)
    }
}