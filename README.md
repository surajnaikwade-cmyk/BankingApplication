# Banking Application

A console-based Banking Application developed using Java. This project demonstrates Object-Oriented Programming (OOP), Java Collections, input validation, and exception handling.

## Objective

To develop a simple banking system that allows users to perform basic banking operations through a menu-driven console interface.

## Features

- Deposit money into an account.
- Withdraw money with sufficient balance validation.
- Check the current account balance.
- View transaction history with date and time.
- Validate positive deposit and withdrawal amounts.
- Handle invalid numeric and menu inputs.
- Prevent withdrawals exceeding the available balance.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework (`ArrayList`)
- Exception Handling
- Java Date and Time API

## Project Structure

```text
BankingApplication/
│
├── BankAccount.java
├── BankingApp.java
├── InputHandler.java
├── Main.java
├── Transaction.java
├── screenshots/
├── .gitignore
└── README.md
```

## Class Responsibilities

| Class             | Responsibility |

|---                |---------------------------------|

| `Main`            | Entry point of the application |

| `BankingApp`      | Displays the menu and manages application flow |

| `BankAccount`     | Handles deposits, withdrawals, and balance |

| `Transaction`     | Stores and displays transaction details |

| `InputHandler`    | Handles user input and invalid input |

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed.
- Command Prompt or PowerShell.

### Compilation

Open the terminal in the project directory and execute:

```bash
javac -d out *.java
```

### Execution

```bash
java -cp out BankingApplication.Main
```

## Application Menu

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

## Testing

The application was tested for:

- Successful deposits and withdrawals.
- Balance inquiry.
- Transaction history.
- Invalid menu input.
- Invalid numeric input.
- Negative deposit and withdrawal amounts.
- Withdrawal exceeding available balance.

## Author

Suraj Naikwade