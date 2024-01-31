fun qualifiesForNextRound(vararg responses : Int): String {

    val likedCount = responses.sum()
    return if (likedCount >= 4) "YES" else "NO"
}
fun main() {

    val t = readln().toInt()
    repeat(t){

        val (r1, r2, r3, r4, r5) = readLine()!!.split(" ").map { it.toInt() }
        val result = qualifiesForNextRound(r1, r2, r3, r4, r5)
        print(result)
    }

}