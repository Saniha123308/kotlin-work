// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    var initial = args[0].toFloat() //celsius temp
    var max = args[1].toFloat()
    var inc = args[2].toFloat()
    while (initial<max){
        val fahrenheit=(initial*1.8)+32.0
        println("%.1f %.1f".format(initial,fahrenheit))
        initial=initial+inc
    }
}
