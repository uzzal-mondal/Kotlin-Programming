package TodayKotlin

fun main(args: Array<String>) {

    // length and string double quote and three fol quote
    var a = "name:Uzzal \n id:20"
    println(a)
    println(a.length)



    var b = """ name : uzzal \n id 22""""
    println(b)
    println(b.length)



    // concat to string
    var name  = "Uzzal "
    var fullName ="$name Mondal"
    println(fullName)




    //string function...
    //knows to index of char ..  to - (n) char remaining...
    var cname:String = "Techoners"
    println(cname.get(5))


    //compare to function..
    // dan paser n1 boro hole negative , bam paser n2 boro hole positive, n1,n2 same - 0
    var n1:String = "muzahid vaia"
    var n2:String = "Muzahid vaia"

    println(n1.compareTo(n2))

    //n1 & n2 akoi noi tai false return kore.
    println(n1.equals(n2))

    //ignore koralm then return to true..
    println(n1.equals(n2,true))




    // # contains function...
    // konon variabler moddhe substring ache kina eta justify korar jonno contains.
    // capital letter thakle false return korbe..
    // true korle ignore hoye jabe then return to true..

    var nm1:String= "muzahid vaia"
    var nm2 :String = "Muzahid vaia"

    println(nm1.contains("Muzahid",true))


    //startwith function..





    //replace..
    // replace word to name ...
    var rplword= "his name is rocky"
    println(rplword.replace("rocky","sajib"))





}