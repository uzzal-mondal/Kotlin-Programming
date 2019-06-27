package TodayKotlin

private enum class Tos{

    WIN, LOSS, TIE
}

fun main(args: Array<String>) {

   // val check:Any = Tos.LOSS
   // val check:Any = "uzzal"
    val check:Any = 10

    when(check){

        is Tos -> println("Class : Toss")
        is String -> print("Class : String")
        is Int -> print("Class : int")

        else -> println("Not in our expected class")
    }
}