fun speciality(x: Int, y: Int, z: Int): String {
    return if(x > y && x > z){
        "setter"
    } else if(y > x && y > z){
        "Tester"
    }else{
        "Editorialist"
    }
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (x, y, z) = readln().split(" ").map { it.toInt() }
        val result = speciality(x, y, z)
        println(result)
    }
}
