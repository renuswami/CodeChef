fun minimumCoins(x: Int): Int{

    val tens = x / 10
    val fives = (x % 10) / 5
    val remaining = (x % 10) % 5

    return if(remaining == 0){
        tens + fives
    }else if(remaining % 5 == 0){
        tens + fives + remaining / 5
    }else{
        -1
    }
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val x = readln().toInt()
        val result = minimumCoins(x)
        println(result)
    }
}