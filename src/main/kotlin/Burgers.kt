fun maximumBurgers(a: Int, b: Int) : Int{

    return if(a < b) a else b
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(a, b) = readln().split(" ").map{it.toInt()}
        val maximumBurgers = maximumBurgers(a, b)
        println(maximumBurgers)
    }
}
