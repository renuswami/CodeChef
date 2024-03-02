fun main(){

    val t = readln().toInt()
    repeat(t){

        val(n, k) = readln()!!.split(" ").map{it.toInt()}
        val score = n - k
        println(score)
    }
}