fun calculateProfit(n: Int): Double{

    val totalIncome = 50*n
    val sugarcane = 0.2 * totalIncome
    val salt =  0.2 * totalIncome
    val coins =  0.3 * totalIncome
    return totalIncome-(sugarcane+salt+coins)
}

fun main(){

    val t = readln().toInt()

    repeat(t){

        val n = readln().toInt()
        val result = calculateProfit(n).toInt()
        println(result)
    }
}
