/* You don't need to add/edit anything to the below solution.
Click on the SUBMIT button to solve your first problem on CodeChef. */

import java.util.*
fun main(args: Array<String>)
{
    val inp = Scanner(System.`in`)
    val t:Int = inp.nextInt()

    repeat(t){
        val a :Int = inp.nextInt()
        val b : Int = inp.nextInt()
        if (a >= b) println(a)
        else println(b)
    }
}