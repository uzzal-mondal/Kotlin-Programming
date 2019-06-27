package TodayKotlin

fun main(args: Array<String>) {

    var row1 = arrayOf(1,2,3)
    var row2 = arrayOf(4,5,6)
    var row3 = arrayOf(7,8,9)

    var array = arrayOf(row1,row2,row3)

    for (i in array){

        for (j in i){

            print("$j ")
        }

        println()
    }


    println("\n\n")




    //differnt way of 2d array declare..

    var array2 = Array(3, {IntArray(3,{-1})})

    for (i in array2){

        for (j in i){

            print("$j ")
        }

        println()
    }

    println("\n\n")


    //differ way to 2d array declare to input...

    var array3 = Array(3,  {IntArray (3,{-1})} )

    for (i in array3.indices){

        for (j in array3[i].indices){

            array3[i][j] = Integer.parseInt(readLine())
        }
    }

    for (i in array3){

        for (j in i){

            print("$j ")
        }
        println()
    }

}

