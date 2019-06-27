package TodayKotlin


fun main(args: Array<String>) {


    //firstly range use
    var range  = 1..10;
    println("The range of: - ")
    range.forEach { print(" $it ") }



    //secondly step keyword
    var stepRange = 1..10 step 2;
    println("\nThe step range of : - ")
    stepRange.forEach { print("$it ") }



    //thirdly reversed range of
    var revRange = 1..10
    println("\nThe reversed range of:- ")
    revRange.reversed().forEach { print("$it ") }



    //forthly down to function
    var df = 10.downTo(1)
    println("\nDown to function :- ")
    df.forEach { print("$it ") }




    //five until function
    var un = 1 until (15)
    println("\nUntil function: -")
   un.forEach { print("$it ") }



}