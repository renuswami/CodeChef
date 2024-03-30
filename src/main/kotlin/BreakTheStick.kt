fun main(){
    var t = readLine()!!.toInt()
    repeat(t){
        var(n,x) = readLine()!!.split(" ").map(String::toInt)
        var rem = n % x
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