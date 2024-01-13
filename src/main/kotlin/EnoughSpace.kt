fun main(){
    val t = readln().toInt()
    repeat(t){
        val(n, x, y) = readln()!!.split(" ").map{it.toInt()}
        if(n >= x+y*2){
            println("YES")
        } else{
            println("NO")
        }
    }
}