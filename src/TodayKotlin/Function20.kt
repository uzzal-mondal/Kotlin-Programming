package TodayKotlin

fun main(args: Array<String>) {

     // inline function of kotlin
    var res = isInlineFun(18,6)
    println("Inline function = $res")

}
  fun isInlineFun(n:Int, m:Int) =
          when{

              n%m==0 -> true
              else -> false
          }