// Task 15.2.3: demo program

fun main() {
    // Plain bank account
    val account = BankAccount("Saniha")
    account.deposit(1250)
    account.withdraw(50)
    println("${account.holder}'s balance: ${account.balance}")

    // Savings account
    val savings = SavingsAccount("Saniha", 1.8)
    savings.deposit(1250)
    savings.applyInterest()
    println("${savings.holder}'s savings balance: ${savings.balance}")
}

