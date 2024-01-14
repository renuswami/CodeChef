fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln()!!.split(" ").map{it.toInt()}
        var chocolate = 2*x
        var candy = 5*y

        if(chocolate > candy){
            println("Chocolate")
        }else if(chocolate<candy){
            println("Candy")
        }else{
            println("Either")
        }
    }
}