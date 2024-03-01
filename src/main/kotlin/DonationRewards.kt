fun donationRewards(x: Int): String{

    return if(x<=3){
        "BRONZE"
    }else if(x in 3..6){
        "SILVER"
    }else{
        "GOLD"
    }
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val x= readln().toInt()
        val result = donationRewards(x)
        println(result)
    }
}