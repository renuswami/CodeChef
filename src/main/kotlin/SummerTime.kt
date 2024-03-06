fun drinkMangoLassi(x: Int): String{

    return if(x > 35) "YES" else "NO"
}
fun main(){

    val x = readln().toInt()
    val temperature = drinkMangoLassi(x)
    println(temperature)
}