// Task 4.2: use of if and ranges

fun main() {
    print("""PIZZA MENU
    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian
    Choose your pizza (a-d):""")
    var x = readln().lowercase()
    if (x.length==1 && x in "a".."d"){
        println("Order accepted")
    }
    else{
        println("Invalid choice!")
    }
}
