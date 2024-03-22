fun findMaximumHeight(heights: IntArray): Int{


    return heights.maxOrNull() ?: 0
}

fun main(){

    val t = readln().toInt()
    repeat(t){

        val n = readln().toInt()
        val heights = IntArray(n)

        repeat(n){ index ->
            heights[index] = readln().toInt()
        }

        val result = findMaximumHeight(heights)
        println(result)
    }
}