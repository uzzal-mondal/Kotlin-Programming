package TodayKotlin

fun main(args: Array<String>) {


     //declare to array of function.
     var arr = arrayOf(10,20,30,40)
     arr.forEach { print("$it ") }

     println("\n")

     for (i in arr){
          println("$i ")
     }

     println("\n")

     // next time value asign
     var num = intArrayOf()

     for (j in 1..5){
          num = num.plus(j*j)
     }
     num.forEach { print("$it ") }


     println("\n")

     // object creation er madhome array make korte pari.

     // function literal.0 or 1 ja dibo setai initalize hobe - function literal dara
     var resarray  = Array<Int>(5,{5})
     resarray.forEach { print("$it ") }




}