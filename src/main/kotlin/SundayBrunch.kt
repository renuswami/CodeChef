fun maximumFeedCompletely(x: Int, y: Int): Int{
    return if(x>(20*y)) 20 else x/y
}
fun main(){
    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val result = maximumFeedCompletely(x, y)
        println(result)
    }
}