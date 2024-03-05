fun chafLikesMatch(x: Int, y: Int): String{

    return if(x>0 && y>0) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val likeMatch = chafLikesMatch(x, y)
        println(likeMatch)
    }
}