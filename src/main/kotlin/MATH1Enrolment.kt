fun main(){

    val t: Int = readLine()?.toInt() ?: 0 // Default to 0 if readLine() is null

    repeat(t){

        val(x, y) = readLine()!!.split(" ").map{it.toInt()}

        val seats = y-x

        if(x>y){
            println("0")
        }else{
            println(seats)
        }
    }
}