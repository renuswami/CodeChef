fun greaterAverage(a: Double , b: Double , c: Double): String {

    val average = (a+b)/2
    return if(average > c) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y,z) = readln().split(" ").map{it.toDouble()}
        val greaterAverage = greaterAverage(x, y, z)
        println(greaterAverage)
    }
}