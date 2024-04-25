fun main(){
    val t = readln().toInt()
    repeat(t){
        val(A, B) =readln().split(" ").map{it.toInt()}
        println(A + B)
    }
}