fun findWhetherClimate(c: Int): String{

    return if(c > 20) "HOT" else "COLD"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val c = readln().toInt()
        val whetherClimate = findWhetherClimate(c)
        println(whetherClimate)
    }
}