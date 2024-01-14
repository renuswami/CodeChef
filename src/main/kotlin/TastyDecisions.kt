fun main(){

    val t = readln().toInt()
    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}
        val chocolate = 2*x
        val candy = 5*y

        if(chocolate > candy){
            println("Chocolate")
        }else if(chocolate<candy){
            println("Candy")
        }else{
            println("Either")
        }
    }
}