fun main(){
    val t = readln().toInt()
    repeat(t){
        val (n,x) = readln().split(" ").map(String::toInt)

        if(n % x == 0){
            println("YES")
        }
        else if(n % 2 == 0 && x % 2 == 0 || x % 2 == 1){
            println("YES")
        }else{
            println("NO")
        }
    }
}