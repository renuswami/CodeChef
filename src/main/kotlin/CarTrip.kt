fun main(){

    val t = readln().toInt()

    repeat(t){
        var x = readln().toInt()
        var needToPay = 0
        if(x < 300){
            x = 300
            needToPay = x*10
        }else{
            needToPay = x*10
        }
        println(needToPay)
    }
}