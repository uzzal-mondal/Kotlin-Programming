package JavaLearning

import java.util.*

fun main(args: Array<String>) {

    var digit:Int;



    var sc = Scanner(System.`in`);
    println("Input your data: ")
     digit = sc.nextInt();
    println("Input data:")

    when(digit){

        1-> println("One");

        2-> println("Two")

        3-> println("Three")

        4-> println("Four")

        5-> println("Five")

        else-> println("Your num don't  match the expression..")



    }


}