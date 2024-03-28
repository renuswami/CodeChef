fun main(){

    var t = readln().toInt()
    while(t-- > 0){

        val (a, b) = readln().split(" ").map { it.toInt()}
        val (x, y) = readln().split(" ").map { it.toInt()}

        if(a > x || b > y){
            println("impossible")
        }else{
            println("possible")
        }
    }
}