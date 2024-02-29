fun isReachedOrNot(x: Int, y:Int): String{

    val kms = x * 5
    return if(kms>=y){
        "YES"
    }else{
        "NO"
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