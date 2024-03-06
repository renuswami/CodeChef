fun  amountOfPetrol(x: Int, y: Int): String{

    val distanceToCover  = 2*y
    return if(distanceToCover <= 15 * x)"YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y) = readln().split(" ").map{it.toInt()}
        val result = amountOfPetrol(x, y)
        println(result)

    }
}