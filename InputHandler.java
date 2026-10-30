
package BankingApplication;

import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    // Constructor
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    // Read integer safely
    public int readInt(String message) {

        while (true) {

            System.out.print(message);

            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;

            } catch (java.util.InputMismatchException e) {

                System.out.println(
                    "Invalid input! Please enter a whole number."
                );

                scanner.nextLine();
            }
        }
    }

    // Read decimal number safely
    public double readDouble(String message) {

        while (true) {

            System.out.print(message);

            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;

            } catch (java.util.InputMismatchException e) {

                System.out.println(
                    "Invalid input! Please enter a numeric amount."
                );

                scanner.nextLine();
            }
        }
    }

    // Read text safely
    public String readString(String message) {

        System.out.print(message);
        return scanner.nextLine();
    }

    // Close scanner
    public void close() {
        scanner.close();
    }
}
