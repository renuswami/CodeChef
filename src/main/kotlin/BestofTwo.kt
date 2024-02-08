/* You don't need to add/edit anything to the below solution.
Click on the SUBMIT button to solve your first problem on CodeChef. */

import java.util.*
fun main(args: Array<String>)
{
    var inp = Scanner(System.`in`);
    var t:Int = inp.nextInt();
    repeat(t)
    {
        var a :Int = inp.nextInt();
        var b : Int = inp.nextInt();
        if (a >= b) println(a);
        else println(b);
    }
}