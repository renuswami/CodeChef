fun isReachedOrNot(x: Int, y:Int): String{

    val kms = x * 5
    if(kms>=y){
        return "YES"
    }else{
        return "NO"
    }
}
fun main(){

    val t = readln().toInt()
    repeat(t){
        
        val(x, y) = readln().split(" ").map{it.toInt()}
        val result = isReachedOrNot(x, y)
        println(result)
    }
}