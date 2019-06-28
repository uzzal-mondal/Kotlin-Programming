package CoddingFollowJuly

fun main(args:Array<String>){

    //Arithmethic operator to  learn this code.

    var a:Int = 10;
    var b:Int = 20;

    // just print show the a, b number.
    println("a= "+a +" , " +"b = "+b)

    //arithmetic operator..
    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")

     //this is parentthisis or empty arithmetic
    println("2+2*3 = ${(2+2)*3}")

    //other system
    a = a+2;
    println("a = a+2 =  ${a}")

    //that is great away

    println("new line\n\n")

    a+=5
    println("a+5 = ${a}")
    println("a++ =  ${a++}")
    println("++a =  ${++a}")


    a-=5
    println("a-5 = ${a}")
    println("a-- = ${a--}")
    println("--a = ${--a}")

    a*=5
    println("a+5 = ${a}")

    a/=5
    println("a/5 = ${a}")

    a%=5
    println("a%5 = ${a}")
}