fun main(){

    val t = readln().toInt()
    repeat(t){
        val (n, k) = readln().split(" ").map{it.toInt()}
        if(k>n){
            println("YES")
        }else{
            println("NO")
        }
    }
}