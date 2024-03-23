fun maximumBottlesFill(n: Int, x: Int, k: Int): Int{

    val bottlesCanFilled = k/x
    return if(bottlesCanFilled < n) bottlesCanFilled else n
}

fun main(){

    val t = readln().toInt()

    repeat(t){

        val (n, x, k) = readln().split(" ").map{it.toInt()}

        val result = maximumBottlesFill(n, x, k)
        println(result)
    }
}