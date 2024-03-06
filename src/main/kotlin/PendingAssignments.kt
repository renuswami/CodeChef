fun pendingAssignments(x: Int, y: Int, z: Int): String{

    val neededTime = x*y
    val givenTime = z*24*60
    return if( givenTime>= neededTime) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y,z) = readln().split(" ").map{it.toInt()}
        val result = pendingAssignments(x, y, z)
        println(result)
    }
}