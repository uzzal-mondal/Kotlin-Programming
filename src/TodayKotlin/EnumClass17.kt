package TodayKotlin


private enum class Toss{

    WIN , LOSS , TIE
}

fun main(args: Array<String>) {

    val toss = Toss.WIN

    when(toss) {

        Toss.WIN -> println("You have win")
        Toss.LOSS -> print("You have loss");
        else -> throw IllegalArgumentException("Toss cann't be tie");

    }

}