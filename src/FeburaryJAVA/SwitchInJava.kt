package FeburaryJAVA

import java.util.Scanner

object SwitchInJava {

    @JvmStatic
    fun main(args: Array<String>) {

        //switch , case , break ,default:----------

        val digit: Int
        val sc = Scanner(System.`in`)
        println("Enter your data: - ")
        digit = sc.nextInt()

        when (digit) {

            0 -> println("Zero")

            1 -> println("One")

            2 -> println("Two ")

            3 -> println("Three")

            4 -> println("Four")

            5 -> println("Five")


            else -> println("Out of condition in your data:")
        }


    }
}
