fun main() {
    repeat(readln().toInt()) {
        val arr = readln().split(" ").map{ it.toInt() }
        if(arr[0] + arr[1] + arr[2] > arr[3] + arr[4] + arr[5]){
            println("1")
        } else {
            println("2")
        }
    }
}