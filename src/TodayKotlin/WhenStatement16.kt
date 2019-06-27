package TodayKotlin

fun main(args: Array<String>) {




    var x :Int = 10;
    when(x) {

        in 1..12 -> println("Kid")
        in 12..20 -> println("children")
        in 20..30 -> println("young")
        in 30..80 -> print("old man")

        else-> print("he is out of bound exception")

    }




    /*
    // if else condition of when keywordddd..

    var num:Int = 10;

    when{

        num%2==0 -> println("even num") else-> println("odd num")
     }
   */





    /*
    var name = "uzzal"

     // when keyword is expression
    when{

        name.startsWith("Mr.") -> println("Male")
        name.startsWith("Ms.") || name.startsWith("Mrs.") -> println("Female")

    }

*/











    /*
    // when using statement..

    var num:Int ;
    var sc = Scanner(System.`in`);
    num = sc.nextInt();

    when(num){

        0 -> println("zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")

        else-> println("There is no num input")

    }

 */









    /*
    // when keyword to is input statement..


    var sc = Scanner(System.`in`)
    println("Enter input dadta:-")

    var day= "Friday"


    when(day){

        "Saturday"-> println("2 classes")
        "sunday"-> println("4 classes")
        "Monday"-> println("Movie")
        "Thuesday"-> println("Game Tutor")
        "Thursday"-> println("Android programming")
        "Friday"-> println("Programming")

        else -> println("No day")

    }

*/


             //function with when keyword..
            //    println(checkNum(100))



               //function with when keyword..


/*
   fun checkNum(num:Int) = when {

    num >0 -> "Possitive"
    num<0 -> "Negative"

    else -> "Zero"

    */

}