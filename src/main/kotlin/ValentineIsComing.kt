fun maximumChocolates(x: Int, y: Int): Int{

    return if(x < y) 0 else x/y
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x,y) = readln().split(" ").map{it.toInt()}
        val maximumChocolates = maximumChocolates(x, y)
        println(maximumChocolates)
    }
}