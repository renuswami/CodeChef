fun monthlyBudget(x: Int, y: Int): String{

    val spendRupees = 30*y
    return if(spendRupees <= x)"YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y) = readln().split(" ").map{it.toInt()}
        val result = monthlyBudget(x, y)
        println(result)

    }
}