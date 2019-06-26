package JavaLearning

import java.util.Scanner

object SwitchTextPoint {

    @JvmStatic
    fun main(args: Array<String>) {

        val grade: String

        val sc = Scanner(System.`in`)
        println("Your Grade Point type in a here")
        grade = sc.nextLine()
        println("YOur Grade result $grade :- ")


        when (grade) {


            "a+" -> println("Your result is Excellent")

            "a", "a-" -> println("Your result is Godd")

            "b", "c" -> println("Your result is Medium")

            "d" -> println("Your result is passed")

            "f" -> println("Your result is Fail")

            else -> println(":Your result is not a define")
        }


    }
}
