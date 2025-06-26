# CODSOFT

# Internship Tasks in Java - Learning & Practice

This repository contains 5 beginner-level Java projects completed during my internship. These tasks are designed to improve logic building, object-oriented programming (OOP), and real-world Java coding.

# TASK 1: Number Guessing Game 

# Description:
A console-based game where the computer generates a random number between 1 to 100, and the user tries to guess it.

# Features:
- Random number generation using `Random` class
- User input using `Scanner`
- Feedback on guess (Too High, Too Low, Correct)
- Limited attempts and score tracking
- Option to play multiple rounds

---

# TASK 2: Student Grade Calculator 

# Description:
Takes marks (out of 100) for multiple subjects and calculates:
- Total Marks
- Average Percentage
- Grade (A, B, C, D, Fail)

# Features:
- Input for marks using `Scanner`
- Calculation of total and average
- Grade based on percentage
- Clean result output


# TASK 3: ATM Interface 

# Description:
Simulates an ATM machine with options like:
- Withdraw
- Deposit
- Check Balance

# Features:
- `ATM` class for interface
- `BankAccount` class for user account
- Input validation (e.g., balance check)
- Simple text-based menu system


# TASK 4: Currency Converter 

# Description:
Converts an amount from one currency to another using exchange rates from an API.

# Features:
- Choose base and target currency
- Input amount
- Use API (like exchangerate-api or fixer.io)
- Show converted result

> Note: API key may be needed, and Java HTTP libraries like `HttpURLConnection` or `OkHttp` are used.


# TASK 5: Student Management System 

# Description:
A system to manage students’ information.

#Features:
- `Student` class with name, roll number, grade, etc.
- `StudentManagementSystem` class to:
  - Add student
  - Remove student
  - Search student
  - Display all students
- Console-based user interface
- Optional: Store data in a file (Java File I/O)

# How to Run

1. Open this folder in your Java IDE (like IntelliJ, Eclipse, or VS Code).
2. Compile the file using:
   bash
   javac Task1_NumberGame.java

   
Internship-Tasks-Java/
│
├── Task1_NumberGame.java
├── Task2_StudentGradeCalculator.java
├── Task3_ATMInterface.java
├── Task4_CurrencyConverter.java
├── Task5_StudentManagementSystem.java
└── README.md

Uploaded Github and command :
git init
git add .
git commit -m "Initial commit with Java tasks and README"
git branch -M main
git remote add origin https://github.com/your-username/internship-tasks-java.git
git push -u origin main

