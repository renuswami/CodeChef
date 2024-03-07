fun waterPark(w: Int, h: Int): String{

    return if(w>=60 && h<=130) "YES" else "NO"
}
fun main(){

    val(w, h) = readln().split(" ").map{it.toInt()}
    val likeMatch = waterPark(w, h)
    println(likeMatch)
}