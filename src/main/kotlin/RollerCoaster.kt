fun minimumHeight(x: Int, h: Int) : String{

    return if(x >= h) "Yes" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, h) = readln().split(" ").map{it.toInt()}
        val minimumHeight = minimumHeight(x, h)
        println(minimumHeight)
    }
}
