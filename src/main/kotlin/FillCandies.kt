fun main() {
    repeat(readln().toInt()){
        val (a,b,c) = readln().split(" ").map{ it.toInt() }
        val d = b*c
        var e = a
        e = if(a%d==0){
            a/d
        }else{
            (a+d-1)/d
        }
        println(e)

    }
}