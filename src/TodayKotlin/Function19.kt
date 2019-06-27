package TodayKotlin

fun main(args: Array<String>) {

    // this is call of main function....

    var res =  subFunction(18,3)
    println("$res")


}

fun subFunction(n:Int, m:Int):Boolean{

    return when{
        n%m ==0 ->true
        else ->false
    }
}