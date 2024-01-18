fun main(){

    val t = readln().toInt()
    repeat(t){
        val(x, y, z) = readLine()!!.split(" ").map{it.toInt()}
        println(z-x)
    }
}