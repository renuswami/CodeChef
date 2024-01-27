fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y) = readln().split(" ").map{it.toInt()}
        val twiceOfInflation = y*2
        if(x >= twiceOfInflation){
            println("YES")
        }else {
            println("NO")
        }
    }
}