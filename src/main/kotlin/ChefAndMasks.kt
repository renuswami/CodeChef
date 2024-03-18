fun main(){

    val t = readln().toInt()

    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}

        val disposableCost = x * 100
        val clothCost = y * 10

        if (disposableCost < clothCost) {
            println("Disposable")
        } else {
            println("Cloth")
        }
    }
}