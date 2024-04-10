fun passOrFali(n: Int, x: Int, p: Int) : String{

    return if ((x*3)-(n-x) >=p) {
        "PASS"
    } else {
        "FAIL"
    }
}

fun main() {
    repeat(readLine()!!.toInt()){
        val (n,x,p) = readLine()!!.split(" ").map{ it.toInt() }
        val result = passOrFali(n, x, p)
        println(result)
    }
}