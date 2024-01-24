fun main(){

    val(a, b, c) = readln().split(" ").map{it.toInt()}

    val chefTotal = a*c
    val chefinaTotal = b*c

    if(chefTotal>chefinaTotal){
        println(chefTotal)
    }else{
        println(chefinaTotal)
    }
}