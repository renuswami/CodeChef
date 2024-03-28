fun profitIncrement(x: Int, y: Int): Int{
    val price = x-y
    var persentage = (x/10)
    persentage += x
    return persentage - price
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val profit = profitIncrement(x, y)
        println(profit)
    }
}