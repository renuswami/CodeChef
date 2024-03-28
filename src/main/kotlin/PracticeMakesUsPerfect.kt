fun maxWeek(array: IntArray): Int{

    var count = 0
    for(element in array){
        if (element >= 10)
            count++
    }
    return count
}

fun main(){

    val array = readln().split(" ").map{it.toInt()}.toIntArray()
    val result = maxWeek(array)
    println(result)
}