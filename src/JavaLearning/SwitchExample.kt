package JavaLearning

import java.util.Scanner

object SwitchExample {

    @JvmStatic
    fun main(args: Array<String>) {

        val digit: Int

        val sc = Scanner(System.`in`)
        println("your num: - ")
        digit = sc.nextInt()

        when (digit) {

            1 -> println("One")

            2 -> println("Two")

            3 -> println("Three")

            4 -> println("Four")

            else -> println("Your number just existing")
        }

    }
}
