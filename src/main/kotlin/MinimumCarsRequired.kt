fun minimumCarsRequried(n: Int) : Int{

    return if (n % 4 == 0) {
        n / 4
    } else {
        val result = n / 4
        result + 1
    }
}
fun main() {
    val testCase = readln().toInt()
    repeat(testCase) {

        val input = readln().toInt()
        val result = minimumCarsRequried(input)
        println(result)
    }
}