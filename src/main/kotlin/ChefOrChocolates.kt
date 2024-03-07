fun chefAndChocolates(c: Int, x:Int, y:Int): Int {

    val chocolate = c-x
    return chocolate*y
}
fun main(){
    val t = readln().toInt()
    repeat(t){
        val (c, x, y) = readln().split(" ").map{it.toInt()}
        val  minimumMoney = chefAndChocolates(c, x, y)
        println(minimumMoney)
    }
}