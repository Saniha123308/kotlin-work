// Task 15.2.3: SavingsAccount class

open class SavingsAccount(holder: String, val rate: Double): BankAccount(holder) {
    init {
        require(rate>0.0) { "Interest rate has to be greater than 0" }
    }

    fun applyInterest() {
        val newamount=balance*(rate/100.0)
        val new=newamount.toInt()
        deposit(new)
    }

}
