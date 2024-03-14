fun winMatch(x: Int, y: Int) : Int{

    return x - y
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val winMatch = winMatch(x, y)
        println(winMatch)
    }
}
