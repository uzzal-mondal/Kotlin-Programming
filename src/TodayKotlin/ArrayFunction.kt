package TodayKotlin

fun main(args: Array<String>) {

    // fill function of array declare...
    var array = arrayOf(10, 20, 30, 40, 50)
     array.fill(-1)
     array.forEach { print("$it ") }




    println("\n")




    // array reversed function..
    var num = arrayOf(10,2,5,4,78,3,6)
    var n = num.reversedArray()

    n.forEach { print("$it ") }
    println()
    num.forEach { print("$it ") }





    //sort array of function.
    println()
    println("Sorting arrray of function soto theke boro.: -")
    var sortarray = arrayOf(20,15,45,36,44)
    sortarray.sort()
    sortarray.forEach { print("$it ") }





    //sort array of function.
    println()
    println("Sorting arrray of function boro theke soto.: -")
    var dsarray = arrayOf(20,15,45,36,44)
    dsarray.sort()
    dsarray.forEach { print("$it ") }





    //sortted array fast orginal array second sorted array
    println()
    println("sortted array fast orginal array second sorted array")
    var tarray = arrayOf(11,12,16,14,15,13)
    var tarray2 = tarray.sortedArray()
    //var tarray2 = tarray.sortedArrayDescending()
    tarray.forEach { print("$it ") }
    println("\n")
    tarray2.forEach { print("$it ") }


    //akta array te nirdishto kisu range projon hoy , tokon amara slice use kori
    //slice function a range bole dite hobe kothy suru korsi then kothy sesh hobe..


    var slarray = arrayOf(5,9,8,4,6,8,7,1,2,3)
    var slarray2 = slarray.sliceArray(2..5)

    slarray2.forEach { print("$it ") }


}