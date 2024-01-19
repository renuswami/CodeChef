fun main(){

    val t = readln().toInt()
    repeat(t){
        val(g, b) = readln().split(" ").map{it.toInt()}
        val minimum = b-g;
        println(minimum)
    }
}