fun main(){

    val t = readln().toInt()

    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        if( (x+y)%2 == 0){
            println("YES")
        } else {
            println("NO")
        }
    }
}