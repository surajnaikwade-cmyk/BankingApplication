
package BankingApplication;

public class BankingApp {

    private BankAccount account;
    private InputHandler input;

    // Constructor
    public BankingApp() {
        account = new BankAccount();
        input = new InputHandler();
    }

    // Display application menu
    public void displayMenu() {

        System.out.println("\n================================");
        System.out.println("       BANKING APPLICATION");
        System.out.println("================================");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Transaction History");
        System.out.println("5. Exit");
        System.out.println("================================");
    }

    // Start the application
    public void start() {

        boolean running = true;

        while (running) {

            displayMenu();

            int choice = input.readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    double depositAmount =
                        input.readDouble("Enter deposit amount: ");

                    account.deposit(depositAmount);
                    break;

                case 2:
                    double withdrawAmount =
                        input.readDouble("Enter withdrawal amount: ");

                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.printf(
                        "Current Balance: INR %.2f%n",
                        account.getBalance()
                    );
                    break;

                case 4:
                    account.displayTransactionHistory();
                    break;

                case 5:
                    System.out.println(
                        "Thank you for using our Banking Application!"
                    );

                    running = false;
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select between 1 and 5."
                    );
            }
        }

        input.close();
    }
}
