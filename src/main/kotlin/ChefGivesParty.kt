fun determineMoney (n: Int, x: Int, k: Int): String{

    val costOfBurger = n*x
    return if(costOfBurger <= k) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(n, x, k) = readln().split(" ").map{it.toInt()}
        val totalMoney = determineMoney(n, x, k)
        println(totalMoney)
    }
}