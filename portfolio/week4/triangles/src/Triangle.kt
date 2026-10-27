// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt
class Triangle(val sideA:Double, val sideB:Double, val sideC:Double){
    init {
        if(!(sideA+sideB>sideC && sideC+sideB>sideA && sideA+sideC>sideB)){
            throw IllegalArgumentException("invalid")
        }
    }
    val perimeter = sideA + sideB + sideC
    val semiPerimeter = perimeter/2
    val s = semiPerimeter
    val extra = s*(s-sideA)*(s-sideB)*(s-sideC)
    val area = sqrt(extra)
    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}

