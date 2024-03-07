fun bestCoupon(x: Int): Int{

    val firstCoupon = 100
    val secondCoupon = (x * 10) / 100
    return if(secondCoupon > 100) secondCoupon else firstCoupon
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val x = readln().toInt()
        val maximumDiscount = bestCoupon(x)
        println(maximumDiscount)
    }
}