fun percentage(x: Int, y: Int): String{
    return if(x < 50) "Z" else if(x >= 50 && y < 50) "F" else "A"
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x,y) = readln().split(" ").map{it.toInt()}
        val percentage = percentage(x, y)
        println(percentage)
    }
}