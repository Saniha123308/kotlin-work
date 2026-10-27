// Task 7.7.1: statistics functions

import kotlin.math.ceil

fun median(list1:List<Float>){
    val list2 = list1.sorted()
    val median = if (list1.size%2!=0){
        val a = list2.size.toFloat()
        val b = ceil(a/2).toInt()
        list2[b-1]
    }
    else{
        val d = list2.size
        val e = (d/2)
        val f = (d/2+1)
        val sum = (list2[e-1]+list2[f-1])
        (sum.toFloat())/2
    }
    println("Median: $median")
}
fun stats(list1:List<Float>){
    median(list1)
    val min = list1.minOrNull()
    val max = list1.maxOrNull()
    val mean = (list1.sum())/(list1.size)
    println("Min: $min")
    println("Max: $max")
    println("Mean: $mean") 
}