fun main(){

    val t = readln().toInt()
    repeat(t){

        val x = readln().toInt()
        if(x<3){
            println("LIGHT")
        }else if(x in 4..6 || x==3){
            println("MODERATE")
        }else println("HEAVY")
    }
}