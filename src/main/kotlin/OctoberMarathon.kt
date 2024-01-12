fun main(){

    val x = readln().toInt()

    if(x < 3 ){
        println("GOLD")
    }else if(x in 3..5){
        println("SILVER")
    }else{
        println("BRONZE")
    }
}