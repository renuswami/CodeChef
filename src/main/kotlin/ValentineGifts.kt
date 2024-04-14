fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()

        if(n >= 127){
            println("YES")
        }else{
            println("NO")
        }
    }
}