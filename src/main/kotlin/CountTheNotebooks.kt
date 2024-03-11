fun calculateNotebooks(n: Int): Int {
    return 10 * n
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val n = readln().toInt()
        val result = calculateNotebooks(n)
        println(result)
    }
}
