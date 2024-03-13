fun minimumPlanes(x: Int, n: Int): Int{

    val planesRequired  = (n+99)/100
    return maxOf(0, planesRequired - x)
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x,n) = readln().split(" ").map{it.toInt()}
        val minimumPlanes = minimumPlanes(x, n)
        println(minimumPlanes)
    }
}