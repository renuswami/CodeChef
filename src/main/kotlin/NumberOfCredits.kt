fun main(){

    val t = readln().toInt()

    repeat(t){

        val(x, y, z) = readln().split(" ").map{it.toInt()}

        val result = x*4+ y*2 + z*0
        println(result)
    }
}