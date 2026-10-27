// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(doc:String,text:String,character:Char='X'): String{
    val newstr = doc.split(" ")
    val newstr1 = newstr.map{ i ->
        if(i==text){
            var word=""
            for(j in i){
                word+=character
            }
        word
        }
        else{
            i
        }
    }
    val final = newstr1.joinToString(" ")
    return final
}