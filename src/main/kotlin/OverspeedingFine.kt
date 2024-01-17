fun main(){

    val t = readln().toInt()
    repeat(t){

        val x = readln().toInt()
        if(x<=70){
            println("0")
        }else if(x in 70..100){
            println("500")
        }else{
            println("2000")
        }
    }

}