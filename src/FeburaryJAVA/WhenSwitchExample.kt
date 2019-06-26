package FeburaryJAVA

import java.util.*

fun main(args:Array<String>){


    val week:Int;

    val sc = Scanner(System.`in`)
    println("Your Input data: - ")
    week = sc.nextInt();
    print("Week data name:- ")

     when(week){

         1-> println("Saturday");

         2-> println("Sunday");

         3-> println("Monday")

         4-> println("Tuesday")

         5-> println("wednesdays")

         6-> println("Thursday")

         7-> println("Friday and is off day")

         else-> println("this your data is existing")


     }
}