fun main(){

    val (n, k) = readln().split(" ").map{ it.toInt() }
    var count = 0

    for(i in 1..n){

        val a = readln().toInt()
        if(a % k == 0){

            count += 1
        }
    }
    println(count)
}