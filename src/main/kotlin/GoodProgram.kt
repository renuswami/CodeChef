fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()

        if(input % 4 == 0){
            println("GOOD")
        }else{
            println("NOT GOOD")
        }
    }
}