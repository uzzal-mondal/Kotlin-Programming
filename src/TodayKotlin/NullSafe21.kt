package TodayKotlin

fun main(args: Array<String>) {

    // safe call is declare to  ?
    // use to question mark and get to null function
    // default vabe somosto datatype a null..
    var name:String? = null
    println(name?.length)




    // smart way to function, safe call to declare.
    var cn:String? = "Muahid vaia"
    if (cn!=null){
        println(cn.length)
    }



    println("\n")

    var nam:String? = null
    var len = nam?.length?: -1
    println(len)



    // working to exception through assert operator !!
    //call to exception through
    var resName: String? = null
    println(resName!!.length)


}