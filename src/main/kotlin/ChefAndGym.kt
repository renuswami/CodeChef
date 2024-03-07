fun chefAndGym(x: Int, y:Int, z:Int): Int {

    val gymTrainerCost = x+y
    return if(gymTrainerCost <= z){
        2
    } else if(x <= z){
        1
    }else{
        0
    }
}
fun main(){
    val t = readln().toInt()
    repeat(t){
        val (x, y,z) = readln().split(" ").map{it.toInt()}
        val  haveTrainer = chefAndGym(x, y, z)
        println(haveTrainer)
    }
}