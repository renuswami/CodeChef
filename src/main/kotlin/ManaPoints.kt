fun main(){

    val t = readln().toInt()

    repeat(t){
        val(x, y) = readln().split(" ").map{it.toInt()}
        println(y/x)
    }
}