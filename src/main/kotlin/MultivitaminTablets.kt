fun main(){

    val t = readln().toInt()
    repeat(t){
        val (x, y) = readln().split(" ").map{it.toInt()}
        val result = x*3
        if(y >= result){
            println("YES")
        }else{
            println("NO")
        }
    }
}