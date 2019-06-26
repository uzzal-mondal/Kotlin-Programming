package FeburaryJAVA

import java.util.Scanner

object SwitchExam {

    @JvmStatic
    fun main(args: Array<String>) {

        val week: Int
        var dayString: String

        val sc = Scanner(System.`in`)
        println("Input your week name")
        week = sc.nextInt()
        dayString = sc.nextLine()
        print("Your week name is : - ")


        when (week) {

            1 -> dayString = "Saturday"

            2 -> dayString = "Sunday"

            3 -> dayString = "Monday"

            4 -> dayString = "Tuesday"

            5 -> dayString = "Thursday"

            6 -> println("Thursday")

            7 -> dayString = "Friday"

            else -> print("your data is existing")
        }


        println(dayString)

    }
}
