fun main(){

    val t = readln().toInt()

    repeat(t){

        val(x, y) = readln()!!.split(" ").map{it.toInt()}

        val doubleRooms = x*3
        val tripleRooms = y*2

        if(doubleRooms > tripleRooms){
            println(tripleRooms)
        }else{
            println(doubleRooms)
        }
    }
}