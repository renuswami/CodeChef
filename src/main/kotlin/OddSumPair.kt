fun canChooseOddSumPair(a: Int, b: Int, c: Int): String{
    return if((a+b)%2!=0 || (a+c)%2!=0 || (b+c)%2!=0) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (a, b, c) = readln().split(" ").map{it.toInt()}
        val result = canChooseOddSumPair(a, b, c)
        println(result)
    }
}