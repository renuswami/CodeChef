fun monopolyInChefland(r1: Int, r2: Int, r3: Int): String{

    return if(r1+r2 < r3) {
        "YES"
    }else if (r1+r3 < r2){
        "YES"
    }else if (r2+r3 < r1){
        "YES"
    }else{
        "NO"
    }
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (r1, r2, r3) = readln().split(" ").map{it.toInt()}
        val result = monopolyInChefland(r1, r2, r3)
        println(result)
    }
}