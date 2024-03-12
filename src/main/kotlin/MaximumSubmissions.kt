fun maximumSubmissions(x: Int): Int{
    return 2*x
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val  x = readln().toInt()
        val result = maximumSubmissions(x)
        println(result)
    }
}