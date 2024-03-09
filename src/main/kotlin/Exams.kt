fun percentageOfStudents(x: Int, y: Int, z: Int): String{

    val totalNoOfStudents = x*y
    val passedPercentage = (z.toDouble() / totalNoOfStudents)*100
    return if(passedPercentage > 50) "YES" else "NO"
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val (x, y, z) = readln().split(" ").map{it.toInt()}
        val result = percentageOfStudents(x, y, z)
        println(result)
    }
}