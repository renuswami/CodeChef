fun main(){

    val t = readln().toInt()

    repeat(t){

        val x = readln().toInt()
        if(x in 67 ..45000){
            println("YES")
        }else{
            println("NO")
        }
    }
}