fun fitness(x: Int): Int{

    return 2*x*5
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val  x = readln().toInt()
        val result = fitness(x)
        println(result)
    }
}