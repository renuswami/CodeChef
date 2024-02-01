fun main(){

    val t = readln().toInt()

    repeat(t){

        val(x1, y1, x2, y2) = readln().split(" ").map{it.toInt()}

        val firstStyle = x1+y1
        val secondStyle = x2+y2

        if(firstStyle>=secondStyle){
            println(secondStyle)
        }else{
            println(firstStyle)
        }
    }
}