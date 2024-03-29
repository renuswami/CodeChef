fun fasterDriving(a: Int, x: Int, b: Int, y: Int): String{

    val alice = a/x
    val bob = b/y

    return if(alice > bob){
        "Alice"
    } else if(alice == bob){
        "Equal"
    }else{
        "Bob"
    }
}

fun main(){

    val t =  readln().toInt()
    repeat(t){

        val(a, x, b, y) = readln().split(" ").map{it.toInt()}
        val result = fasterDriving(a, x, b, y)
        println(result)
    }
}