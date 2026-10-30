# Banking Application

A console-based Banking Application developed using Java as part of the **WeIntern Java Development Internship – Week 1 Assignment**.

This project demonstrates Object-Oriented Programming (OOP), Java Collections, exception handling, and input validation through a simple menu-driven banking system.

## Objective

To develop a simple banking system that allows users to perform basic banking operations through a menu-driven console interface while ensuring proper input validation and handling invalid transactions.

## Features

- **Deposit Money:** Deposit money into an account with positive amount validation.
- **Withdraw Money:** Withdraw money after checking the available account balance.
- **Balance Inquiry:** Check the current account balance.
- **Transaction History:** View successful deposits and withdrawals with date and time.
- **Input Validation:** Handle invalid numeric input and incorrect menu choices.
- **Exception Handling:** Handle invalid inputs and prevent invalid transactions.
- **Insufficient Balance Check:** Prevent withdrawals exceeding the available balance.
- **Transaction Tracking:** Maintain transaction records using Java Collections.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework (`ArrayList`)
- Exception Handling (`InputMismatchException`)
- Java Date and Time API (`LocalDateTime`)
- Git and GitHub

## Project Structure

```text
BankingApplication/
│
├── BankAccount.java
├── BankingApp.java
├── InputHandler.java
├── Main.java
├── Transaction.java
│
├── screenshots/
│   ├── Deposit.jpg
│   ├── DepositValidCheck.jpg
│   ├── Exit.jpg
│   ├── OptionValidity.jpg
│   ├── TransaconHistory.jpg
│   ├── WithDrawValidCheck.jpg
│   ├── Withdraw.jpg
│   └── balanceCheck.jpg
│
├── .gitignore
└── README.md
```

## Class Responsibilities

| Class | Responsibility |
|---|---|
| `Main.java` | Entry point of the application. |
| `BankingApp.java` | Displays the banking menu and manages application flow. |
| `BankAccount.java` | Handles deposits, withdrawals, balance management, and transaction history. |
| `Transaction.java` | Stores transaction type, amount, and date/time details. |
| `InputHandler.java` | Handles user input and invalid input using exception handling. |

## Clone the Repository

To get a local copy of this project, clone the repository using:

```bash
git clone https://github.com/surajnaikwade-cmyk/BankingApplication.git
```

Navigate to the project directory:

```bash
cd BankingApplication
```

## Prerequisites

Before running the application, ensure that you have:

- Java Development Kit (JDK) installed.
- Command Prompt, PowerShell, or a terminal.
- Git installed (for cloning the repository).

Verify your Java installation:

```bash
java -version
javac -version
```

## How to Compile and Run

### 1. Compile the Java Files

Open the terminal in the project directory and execute:

```bash
javac -d out *.java
```

This command compiles the Java source files and places the compiled classes inside the `out` directory.

### 2. Run the Application

Execute the following command:

```bash
java -cp out BankingApplication.Main
```

## Application Menu

When the application starts, the following menu is displayed:

```text
================================
       BANKING APPLICATION
================================
1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Transaction History
5. Exit
================================
Enter your choice:
```

## Sample Operations

### 1. Deposit Money

```text
Enter your choice: 1
Enter deposit amount: 5000
Deposit successful! Current balance: INR 5000.00
```

### 2. Withdraw Money

```text
Enter your choice: 2
Enter withdrawal amount: 1000
Withdrawal successful! Current balance: INR 4000.00
```

### 3. Check Balance

```text
Enter your choice: 3
Current Balance: INR 4000.00
```

### 4. Transaction History

```text
========== TRANSACTION HISTORY ==========
DEPOSIT      INR 5000.00 | 30-Oct-2026 02:00 PM
WITHDRAWAL   INR 1000.00 | 30-Oct-2026 02:05 PM
=========================================
```

*Note: Sample transaction timestamps are illustrative.*

## Screenshots

The following screenshots demonstrate the application's functionality and input validation.

| Screenshot | Description |
|------------|--------------------------------------------|

| `Deposit.jpg` --> Demonstrates the deposit operation. |

| `DepositValidCheck.jpg` --> Demonstrates deposit input validation. |

| `balanceCheck.jpg` --> Displays the current account balance. |

| `OptionValidity.jpg` --> Demonstrates invalid menu option handling. |

| `TransaconHistory.jpg` --> Displays transaction history. |

| `Withdraw.jpg` --> Demonstrates the withdrawal operation. |

| `WithDrawValidCheck.jpg` --> Demonstrates withdrawal input validation. |

| `Exit.jpg` --> Shows the application exit operation. |

## Testing

The application was tested with the following scenarios:

1. Successful deposit operation.
2. Successful withdrawal operation.
3. Balance inquiry.
4. Transaction history display.
5. Invalid menu input.
6. Invalid numeric input for deposit and withdrawal.
7. Negative deposit and withdrawal amounts.
8. Withdrawal exceeding the available balance.
9. Verification that rejected transactions do not affect the account balance.

## Concepts Demonstrated

- Classes and Objects
- Encapsulation
- Constructors and Methods
- Conditional Statements
- Loops and Switch Statements
- ArrayList
- Exception Handling
- Input Validation
- Java Date and Time API

## Future Enhancements

- Multiple bank accounts.
- Account holder details.
- PIN-based authentication.
- Minimum balance requirement.
- Persistent transaction storage.

## Author

Suraj Naikwade 

## GitHub Repository

[BankingApplication – GitHub](https://github.com/surajnaikwade-cmyk/BankingApplication)

---
