import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextDouble()

    val m = 0.50
    if (x > (y - m)  || x % 5 != 0){println("$y")}
    else{
        println("%.2f".format((y- x - m)))

    }
}
