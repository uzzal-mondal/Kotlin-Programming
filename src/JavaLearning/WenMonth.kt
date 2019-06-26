package JavaLearning

import java.util.*

fun main(args:Array<String>){


    val month:Int;

     val sc = Scanner(System.`in`)
    println("Your Input month Name: - ")
     month = sc.nextInt();
    print("Your month name  is - $month : - ");

    when(month){

        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("April")
        5-> println("MayKotlinSolving")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")

        else -> println("Month is not define..")


    }
}