fun capacityOfBucket(k: Int, x: Int): Int{
    return k-x
}
fun main(){

    val t = readln().toInt()
    repeat(t){

        val(k, x) = readln().split(" ").map{it.toInt()}
        val litersOfWater = capacityOfBucket(k, x)
        println(litersOfWater)
    }
}