fun chocolatesDivision(n: Int): String {

    val chocolatesDivision = n % 2
    return if(chocolatesDivision != 0) "NO" else "YES"
}
fun main(){
    val t = readln().toInt()
    repeat(t){

        val n = readln().toInt()
        val chocolates = chocolatesDivision(n)
        println(chocolates)
    }

}