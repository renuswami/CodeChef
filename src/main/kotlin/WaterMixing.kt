fun main() {
    repeat(readln().toInt()){
        val (a,b,c,d) = readln().split(" ").map{ it.toInt() }
        if((b-a in 0..c) || (b-a < 0 && a-b <=d)) {
            println("YES")
        }else{
            println("NO")
        }
    }
}