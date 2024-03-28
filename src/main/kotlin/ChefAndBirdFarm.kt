fun main() {
    repeat(readln().toInt()){
        val (x,y,z) = readln().split(" ").map{ it.toInt() }
        when(true){
            (z%x==0 && z%y==0)->println("Any")
            (z%y==0)->println("Duck")
            (z%x==0)->println("Chicken")
            else->println("None")
        }
    }
}