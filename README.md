# 🚕 Task 02 — Cab Booking Chatbot | Java

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java"/>
  <img src="https://img.shields.io/badge/Interface-Console-blue?style=for-the-badge" alt="Console Application"/>
  <img src="https://img.shields.io/badge/Authentication-OTP-green?style=for-the-badge" alt="OTP Verification"/>
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" alt="Project Status"/>
</p>

<p align="center">
  A menu-driven Java application that simulates a cab booking system with predefined routes, dynamic fare calculation, booking confirmation, and four-digit OTP verification.
</p>

<p align="center">
  <b>Organization:</b> Kiran Academy<br>
  <b>Task:</b> Task 02 — Cab Booking Chatbot<br>
  <b>Submission Date:</b> 16 October 2026
</p>

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [Objectives](#-objectives)
- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [System Workflow](#-system-workflow)
- [Cab Types and Pricing](#-cab-types-and-pricing)
- [Predefined Routes](#-predefined-routes)
- [Fare Calculation](#-fare-calculation)
- [OTP Verification](#-otp-verification)
- [Project Structure](#-project-structure)
- [Installation and Execution](#-installation-and-execution)
- [Sample Test Scenario](#-sample-test-scenario)
- [Business Rules](#-business-rules)
- [Learning Outcomes](#-learning-outcomes)
- [Author](#-author)
- [Acknowledgements](#-acknowledgements)

---

## 📖 About the Project

The **Cab Booking Chatbot** is a console-based Java application developed as part of the Kiran Academy programming task.

The application simulates a basic cab booking experience through an interactive, menu-driven interface. Users can select their preferred cab type, choose a predefined route, view the calculated fare, and confirm or cancel their booking before OTP verification.

Once the user confirms the booking, the system generates a four-digit OTP for verification. After successful verification, the booking is confirmed and the ride is locked against cancellation through the booking menu.

The project focuses on implementing fundamental Java programming concepts through a practical, real-world scenario.

## 🎯 Objectives

- Develop an interactive console application using Java.
- Implement a menu-driven program using loops.
- Accept and validate user input using the `Scanner` class.
- Calculate cab fares using predefined distances and rates.
- Implement booking confirmation and pre-confirmation cancellation.
- Generate and verify a four-digit OTP.
- Enforce booking and ride-locking rules.
- Handle invalid menu selections without terminating the program unexpectedly.

## ✨ Features

| Feature | Description |
|---|---|
| Interactive Menu | Repeatedly displays the main menu until the user exits. |
| Cab Selection | Supports Auto, Sedan, and SUV. |
| Route Selection | Provides three predefined routes. |
| Fixed Distance | Uses predefined distances for fare calculation. |
| Fare Calculation | Calculates the total fare using distance and rate per kilometre. |
| Booking Confirmation | Allows confirmation or cancellation before OTP sharing. |
| OTP Generation | Generates a random four-digit OTP. |
| OTP Verification | Checks whether the entered OTP matches the generated OTP. |
| Ride Locking | Prevents cancellation after successful booking confirmation. |
| Input Validation | Handles invalid menu and selection choices. |
| Exit Option | Ends the program when the user selects Exit. |

## 🛠️ Technology Stack

- **Programming Language:** Java
- **User Input:** `java.util.Scanner`
- **OTP Generation:** `java.util.Random`
- **Control Flow:** `if-else`, `switch`, and loops
- **Core Concepts:** Methods, variables, arithmetic operations, conditional logic, and input validation
- **Execution Environment:** JDK and a Java-compatible IDE or terminal

## 🔄 System Workflow

```text
             ┌──────────────────────┐
             │      Start Program   │
             └──────────┬───────────┘
                        │
             ┌──────────▼───────────┐
             │      Main Menu       │
             │ 1. Book Ride         │
             │ 2. Exit              │
             └──────────┬───────────┘
                        │
             ┌──────────▼───────────┐
             │     Select Cab       │
             │ Auto / Sedan / SUV   │
             └──────────┬───────────┘
                        │
             ┌──────────▼───────────┐
             │    Select Route      │
             └──────────┬───────────┘
                        │
             ┌──────────▼───────────┐
             │ Calculate and Display│
             │       Fare           │
             └──────────┬───────────┘
                        │
             ┌──────────▼───────────┐
             │ Confirm the Booking? │
             └──────┬────────┬──────┘
                    │        │
               Cancel     Confirm
                    │        │
             Return to       ▼
             Main Menu  Generate OTP
                             │
                    ┌────────▼────────┐
                    │ Verify Entered  │
                    │       OTP       │
                    └────────┬────────┘
                             │
                    ┌────────▼────────┐
                    │  OTP Correct?   │
                    └────┬────────┬───┘
                         │        │
                        Yes       No
                         │        │
                   Confirm Ride   Reject
                   and Lock Ride  Booking
```

## 🚖 Cab Types and Pricing

The application uses fixed per-kilometre rates.

| Cab Type | Rate per KM | Example: 8 KM |
|---|---:|---:|
| Auto | ₹12/km | ₹96 |
| Sedan | ₹18/km | ₹144 |
| SUV | ₹25/km | ₹200 |

## 📍 Predefined Routes

| Route No. | Source | Destination | Distance |
|---|---|---|---:|
| 1 | Pune Station | Shivajinagar | 5 km |
| 2 | Swargate | Kothrud | 8 km |
| 3 | Hinjawadi | Wakad | 10 km |

The user selects a route number. The application uses its predefined source, destination, and distance rather than accepting a custom distance.

## 🧮 Fare Calculation

The fare is calculated using the following formula:

**Total Fare = Route Distance × Selected Cab Rate per KM**

### Example

Suppose the user selects:

- Cab Type: Sedan
- Source: Swargate
- Destination: Kothrud
- Distance: 8 km
- Rate: ₹18 per km

Calculation:

`Total Fare = 8 × 18 = ₹144`

The application displays the selected cab type, route, distance, per-kilometre rate, and total fare.

## 🔐 OTP Verification

OTP verification is performed after the user confirms the booking.

### Verification Process

1. Generate a random four-digit OTP.
2. Display the OTP in the console to simulate sharing it.
3. Ask the user to enter the OTP.
4. Compare the entered OTP with the generated OTP.
5. If the OTP matches, confirm the booking and lock the ride.
6. If the OTP does not match, reject the booking confirmation.

### Java OTP Generation Example

```java
import java.util.Random;

Random random = new Random();
int otp = 1000 + random.nextInt(9000);
```

This generates an integer between `1000` and `9999`, inclusive.

**Important:** This project simulates OTP sharing in the console. It does not send real SMS messages or emails. The OTP is intended for demonstrating the assignment's verification logic, not for production authentication.

## 📂 Project Structure

```text
Task 02 – Cab Booking Chatbot – 16/10/2026/
│
├── Task2.java
└── README.md
```

*Replace `Task2.java` with your actual Java filename if it differs.*

## ⚙️ Installation and Execution

### Prerequisites

- Java Development Kit (JDK) installed.
- A terminal, Command Prompt, VS Code, or IntelliJ IDEA.
- Basic familiarity with compiling and running Java programs.

### Step 1: Clone the Repository

Open your terminal and run:

```bash
git clone "YOUR_REPOSITORY_URL"
```

Replace `YOUR_REPOSITORY_URL` with the HTTPS URL copied from your GitHub repository.

### Step 2: Open the Project Directory

```bash
cd "YOUR_PROJECT_FOLDER"
```

### Step 3: Compile the Java Program

If your Java file is named `Task2.java`, run:

```bash
javac Task2.java
```

### Step 4: Execute the Program

```bash
java Task2
```

Ensure the class name used in the command matches the public class name in the Java source file.

## 🧪 Sample Test Scenario

### Input

1. Select Book Ride.
2. Choose Sedan.
3. Select route 2: Swargate → Kothrud.
4. Confirm the booking.
5. Enter the generated OTP.

### Expected Calculation

| Parameter | Value |
|---|---|
| Selected Cab | Sedan |
| Route | Swargate → Kothrud |
| Distance | 8 km |
| Rate | ₹18/km |
| Total Fare | ₹144 |

### Expected Behaviour

- The fare is displayed before confirmation.
- The OTP is generated only after confirmation.
- A correct OTP results in a confirmed, locked booking.
- An incorrect OTP does not confirm the booking.
- Cancellation is available before OTP sharing, but not after the booking is confirmed and locked.
- Selecting Exit terminates the program.

## 📋 Business Rules

1. The main menu must repeat until the user exits.
2. Only the predefined cab types and routes are allowed.
3. Route distances must remain fixed.
4. The fare must be calculated from the selected cab rate and route distance.
5. The user must confirm the booking before OTP generation.
6. Cancellation must be handled before OTP sharing.
7. After successful OTP verification, the booking is confirmed and locked.
8. Invalid menu choices must be handled without an infinite loop or unexpected termination.

## 📚 Learning Outcomes

By completing this task, the following concepts are practised:

- Java program structure and execution.
- Console input using `Scanner`.
- Menu-driven application design.
- Repetition using loops.
- Decision-making using conditional statements.
- Selection using `switch` statements.
- Random number generation.
- OTP comparison and verification.
- Arithmetic operations and fare calculation.
- Input validation and basic application workflow design.

## 👨‍💻 Author

**Bhagyesh Patil**

B.Tech Information Technology Student

<p align="left">
  <a href="https://www.linkedin.com/in/bhagyeshrmy4143/">
    <img src="https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin" alt="LinkedIn"/>
  </a>
  <a href="https://github.com/Rmy4143/">
    <img src="https://img.shields.io/badge/GitHub-Profile-black?style=for-the-badge&logo=github" alt="GitHub"/>
  </a>
</p>

- **LinkedIn:** [Bhagyesh Patil](https://www.linkedin.com/in/bhagyeshrmy4143/)
- **GitHub:** [Rmy4143](https://github.com/Rmy4143/)

## 🙏 Acknowledgements

Thanks to **Kiran Academy** for providing this programming task to practise Java fundamentals, menu-driven programming, fare calculation, and OTP-based booking confirmation.

---

<p align="center">
  <b>Built with Java ☕ | Task 02 | 16 October 2026</b>
</p>
