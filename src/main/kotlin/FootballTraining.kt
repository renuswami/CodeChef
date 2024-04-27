fun famous (x: Int, y: Int ): String{
    if(x >y){
        return "FREEKICK"
    }else{
        return "PENALTY"
    }

}

fun main(){
    var (x , y) = readln().split(" ").map{it.toInt()}
    var r = famous(x, y)
    println(r)
}