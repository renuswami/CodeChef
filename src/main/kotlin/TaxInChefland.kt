fun main(){

    val t = readln().toInt()
    repeat(t){
        val x = readln().toInt()
        if(x > 100){
            println(x-10)
        }else{
            println(x)
        }
    }
}