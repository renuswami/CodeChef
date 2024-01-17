fun main() {

    val x = readln().toInt()
    val lastTwoDigits = x % 100
    val phoneModel = "K${"%02d".format(lastTwoDigits)}"
    println(phoneModel)
}
