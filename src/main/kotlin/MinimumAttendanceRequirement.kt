fun main(){
    var t = readln().toInt()
    while(t-->0){
        val length = readln().toInt()
        var present = 0
        if(length<120) present = 120 - length
        val string = readln()
        for(i in string){
            if(i == '1') present++
        }
        if(((present*1.0)/120)>=.75) println("YES") else println("NO")
    }
}