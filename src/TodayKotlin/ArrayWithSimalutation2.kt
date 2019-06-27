package TodayKotlin

fun main(args: Array<String>) {

    var array = Array<String>(10,{

        when{
            it%2==0 -> "Even"
            else -> "Odd"
        }})


    println(array.size)
    array.forEach { print("$it ") }
}