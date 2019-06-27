package TodayKotlin

fun main(args: Array<String>) {

    for (i in 1..5){

        for (j in 1..i){

            print("*")
        }

        println()
    }


    /*
     var num = arrayOf(10,20,30,40,50,60,70,80)

     for (i in num.indices){

         println("index =$i and value of = ${num[i]}")
     }
 */



    /*
        // array o function to for loop

       var num = arrayOf(10,12,13,14,15,16,17)

       for (i in num){

           println(i)
       }

       */





    /*

    // for loop range...

    for (i in 1..10 step 2){

        println("the res ${i}")
    }

*/



/*
   // for loop programming.

    for (i in 1..10){

        if (i%2==0){

            println("Even num ${i} ")
        }else{

            println("Odd num ${i}")
        }
    }

*/
}