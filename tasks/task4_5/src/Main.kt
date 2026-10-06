// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val limit = args[0].toInt()
    var sum = 0
    for (i in 1..limit step 2){
        sum = sum + i
    }
    println(sum)
}
