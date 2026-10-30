
package BankingApplication;

import java.time.LocalDateTime;

public class Transaction {

    private String type;
    private double amount;
    private LocalDateTime dateTime;

    // Constructor
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    // Get transaction type
    public String getType() {
        return type;
    }

    // Get transaction amount
    public double getAmount() {
        return amount;
    }

    // Get transaction date and time
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    // Display transaction details
    public void displayTransaction() {

        System.out.printf(
            "%-12s INR %.2f | %s%n",
            type,
            amount,
            dateTime
        );
    }
}
