fun main(){

    val (x, y) = readLine()!!.split(" ").map{it.toInt()}
    if(x > y){
        println("New")
    }else{
        println("Old")
    }
}