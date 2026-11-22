# Software Maintenance Lab

**Course:** Software Construction and Development  
**Department:** Software Engineering  
**University:** UET Peshawar, Abbottabad Campus

## Project Overview

This project demonstrates important software maintenance and development practices, including code refactoring, defensive programming, SOLID principles, immutable objects, structured tracing, and automated unit testing.

## Lab Tasks

### Task 1: Refactoring Legacy Code

Refactored the legacy `ReportManager` class to improve maintainability.

- Replaced inefficient string concatenation with `String.join()`.
- Used null-safe programming practices.
- Introduced the `ReportFormatter` interface.
- Implemented `PdfFormatter` and `CsvFormatter`.
- Introduced constructor injection using the `Notifier` interface.
- Implemented `EmailNotifier` to handle email notifications.

### Task 2: Defensive Programming and Immutability

Implemented `BankTransfer` as an immutable Java Record.

- Used `Objects.requireNonNull()` to prevent null values.
- Validated that transfer amounts must be strictly positive.
- Tested invalid inputs, including null values and negative amounts.

### Task 3: Structured Tracing

Implemented a payment processing simulation using transaction correlation IDs.

- Added transaction IDs to payment log messages.
- Displayed payment processing information.
- Used a `try-finally` block to demonstrate context cleanup.
- Demonstrated how trace IDs help track individual transactions.

### Task 4: Automated Quality Gate

Implemented a JUnit 5 unit test for the `OrderService` class.

- Used the `VipDiscount` implementation.
- Followed the Arrange, Act, and Assert testing pattern.
- Verified that a 20% VIP discount is correctly applied.
- Tested the calculation without requiring database access.

**Test Method:**

`calculateTotal_appliesVipDiscount_withoutTouchingDatabase()`

## Technologies Used

- Java 26
- Apache NetBeans IDE
- Apache Maven
- JUnit 5

## Project Structure

```text
SoftwareMaintenanceLab
│
├── src
│   ├── main
│   │   └── java
│   │       ├── com.uet.report
│   │       ├── com.uet.bank
│   │       ├── com.uet.payment
│   │       └── com.uet.billing
│   │
│   └── test
│       └── java
│           └── com.uet.billing
│               └── OrderServiceTest.java
│
├── pom.xml
└── README.md
```

## How to Run

1. Open the project in Apache NetBeans.
2. Allow Maven to download the required dependencies.
3. Run the `Main.java` class in the `com.uet.report` package to test report generation.
4. Run the `BankMain.java` class to test defensive validation.
5. Run the `PaymentMain.java` class to test structured tracing.
6. Run `OrderServiceTest.java` to execute the JUnit test.

Alternatively, execute the automated tests using Maven:

```bash
mvn test
```

## Conclusion

This project demonstrates how software maintenance techniques can improve code readability, reliability, testability, and extensibility. Applying SOLID principles, defensive programming, immutable data structures, and automated testing helps create more maintainable software systems.
