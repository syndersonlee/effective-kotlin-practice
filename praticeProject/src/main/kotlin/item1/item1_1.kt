package item1

import kotlin.jvm.Throws

class BankAccount{
    var balance = 0.0
        private set
    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawAmount: Double) {
        if(balance < withdrawAmount) {

        }
        balance -= withdrawAmount
    }
}

class InsufficientFunds : Exception()

fun main() {
    val account = BankAccount()
    println(account.balance)
    account.deposit(100.0)
    println(account.balance)
    account.withdraw(50.0)
    println(account.balance)
}

