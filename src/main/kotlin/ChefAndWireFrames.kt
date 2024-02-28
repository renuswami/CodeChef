fun main(){

    val t = readln().toInt()
    repeat(t){

        val (length, width, costPerCm) = readLine()!!.split(" ").map { it.toInt()}
        val perimeter = 2*(length+width)
        val totalPrice = perimeter*costPerCm
        println(totalPrice)
    }
}