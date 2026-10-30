
package BankingApplication;

import java.util.ArrayList;

public class BankAccount {

    private double balance;

    // Store transaction history
    private ArrayList<Transaction> transactions;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Deposit money
    public void deposit(double amount) {

        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println(
                "Deposit amount must be a valid positive number."
            );
            return;
        }

        balance += amount;

        // Record successful deposit
        Transaction transaction =
            new Transaction("DEPOSIT", amount);

        transactions.add(transaction);

        System.out.printf(
            "Deposit successful! Current balance: INR %.2f%n",
            balance
        );
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println(
                "Withdrawal amount must be a valid positive number."
            );
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;

        // Record successful withdrawal
        Transaction transaction =
            new Transaction("WITHDRAWAL", amount);

        transactions.add(transaction);

        System.out.printf(
            "Withdrawal successful! Current balance: INR %.2f%n",
            balance
        );
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Display transaction history
    public void displayTransactionHistory() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }

        System.out.println("\n========== TRANSACTION HISTORY ==========");

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }

        System.out.println("=========================================");
    }
}
