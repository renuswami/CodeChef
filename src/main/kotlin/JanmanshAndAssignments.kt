fun completeAssignments(x: Int): String{

    val assignmentTime = x+3
    return if(assignmentTime>10) "NO" else "YES"
}
fun main(){
    val t = readln().toInt()
    repeat(t){
        val x = readln().toInt()
        val  result = completeAssignments(x)
        println(result)
    }
}