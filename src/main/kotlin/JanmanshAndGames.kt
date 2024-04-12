fun main() {
    repeat(readln().toInt()){
        val (x,y) = readln().split(" ").map{ it.toInt() }
        if((x+y)%2 == 0){
            println("Janmansh")
        }else{
            println("Jay")
        }
    }
}