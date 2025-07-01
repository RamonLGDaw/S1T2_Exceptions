# Sprint 1 Task 4 - Exception

This repository contains exercises focused on learning and practicing exception handling in Java.

Technologies used:
- JDK 17
- IntelliJ IDEA
- Git

## Introduction

The objective of these exercises is to learn and practice exception handling in Java. You'll encounter custom exceptions, handle input mismatches, and work with real-world Java scenarios that require robust error handling mechanisms.

## Getting Started

To get started with this project, follow these steps:

1. **Clone the repository**:
 git clone  https://github.com/RamonLGDaw/S1T2_Exceptions.git

2. **Open the project in IntelliJ IDEA**:
- Launch IntelliJ IDEA.
- Select "Open" and navigate to the directory where you cloned the repository.
- Open the project.

3. **Build and run the project**:
- Ensure you are using JDK 17.
- Use the Run configurations in IntelliJ IDEA to execute the exercises.

## Level 1

### Exercise 1

Create a class named "Product" with attributes `name` and `price`, and another class named "Sale". This class has attributes such as a collection of products and the total price of the sale.

The "Sale" class has a method called `calculateTotal()` that throws a custom exception "EmptySaleException" and prints "To make a sale, you must first add products" if the collection of products is empty. If there are products in the collection, it should iterate through them and store the sum of all product prices in the total price attribute of the sale.

The custom exception "EmptySaleException" should extend the `Exception` class. Its constructor should accept the message "To make a sale, you must first add products", and when catching the exception, it should display the message using the `getMessage()` method of the exception.

Write the necessary code to generate and catch an `IndexOutOfBoundsException`.

---

## Level 2

### Exercise 1

Create a class named "InputHandler". This class is designed to handle various exceptions that can occur in Java when reading input from the keyboard using the `Scanner` class.

Start by instantiating an object of the `Scanner` class and then create static methods to read different data types from the keyboard.

**Important**

It's crucial that if an exception is thrown in any method, it is handled, and the user is prompted again until the input is correctly entered. For example, if the user enters a float with a period instead of a comma, it should display "Format error". The method should continue to prompt the user until a correctly formatted float is entered.

All methods receive a `String` message to display to the user, e.g., "Enter your age", and return the appropriate data type entered by the user in each method, e.g., a `byte` representing the user's age.

**Methods to implement capturing `InputMismatchException`:**

- `public static byte readByte(String message);`
- `public static int readInt(String message);`
- `public static float readFloat(String message);`
- `public static double readDouble(String message);`

**Methods to implement capturing a custom `Exception` class:**

- `public static char readChar(String message);`
- `public static String readString(String message);`
- `public static boolean readYesNo(String message);`, if the user enters "y", return `true`; if the user enters "n", return `false`.

