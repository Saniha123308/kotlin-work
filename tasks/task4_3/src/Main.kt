// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt
import kotlin.system.exitProcess
fun main(args:Array<String>){
    if (args.size!=3){
        println("Error: All 3 grades to be given")
        exitProcess(1)
    }
    val a = args[0].toInt()
    val b = args[1].toInt()
    val c = args[2].toInt()
    val average = ((a+b+c).toDouble()/3.0).roundToInt()
    val grade = when(average){
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> "Invalid"
    }
    println(grade)
}