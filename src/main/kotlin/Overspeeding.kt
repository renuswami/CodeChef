fun overspeeding(s: Int): String {

    return if(s <= 40) "NO" else "YES"
}

fun main(){

    val s = readln().toInt()
    val result = overspeeding(s)
    println(result)
}