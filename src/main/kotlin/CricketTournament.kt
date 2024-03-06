fun cricketTournament(x: Int, y:Int): String{

    return if(y>=x) "NO" else "YES"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val result = cricketTournament(x, y)
        println(result)
    }
}