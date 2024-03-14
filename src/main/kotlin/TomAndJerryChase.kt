fun canTomCatchJerry(x: Int, y: Int) : String{

    return if(x < y) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        println(canTomCatchJerry(x, y))

    }
}
