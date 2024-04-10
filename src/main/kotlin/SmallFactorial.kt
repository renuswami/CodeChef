import java.util.*

internal object Codechef {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var t = sc.nextInt()
        while (t-- > 0) {
            val n = sc.nextInt()
            var fact = 1
            for (i in n downTo 2) {
                fact *= i
            }
            println(fact)
        }
    }
}
