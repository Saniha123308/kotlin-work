// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(sides:Triangle):Boolean {
    val list1 = sides.toList()
    for(i in list1){
        if(list1[0]+list1[1]>list1[2] && list1[1]+list1[2]>list1[0] && list1[0]+list1[2]>list1[1]){
            return true
        }
    }
    return false
}
fun triangleArea(sides:Triangle): Double{
    val list2 = sides.toList()
    val a = list2[0]
    val b = list2[1]
    val c = list2[2]
    val s = (a+b+c)/2
    val extra = s*(s-a)*(s-b)*(s-c)
    val Area = sqrt(extra)
    return Area
}


 

