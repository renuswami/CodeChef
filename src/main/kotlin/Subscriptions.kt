fun subscriptions(n: Int, x: Int): Int{

    val subscriptionsNeeded = (n + 5) / 6
    return subscriptionsNeeded * x
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(n, x) = readln().split(" ").map{it.toInt()}
        val costOfSubscription = subscriptions(n, x)
        println(costOfSubscription)
    }
}