
# Simple Payment Features Design
### Problem Statement

This project demonstrates how a simple payment feature can be designed using
Object-Oriented Programming principles.

## Objective
- Design a simple payment system using Java
- Apply core OOP principles (abstraction, encapsulation, polymorphism, Inheritence)
- Keep business logic minimal and easy to understand
- Follow atomic Git commit practices

## Scope
- Supports basic payment methods (UPI, Card, Net Banking)
- No external integrations
- Intended for a short demo

#
## Project Structure

```
PaymentFeatureWithOOP/
├── README.md               # You are reading it
├── Account.java            # Account will have balance and has access to modify it
├── User.java               # Represents a user owning an account
├── PaymentMethod.java      # Abstract payment contract
├── UPIPayment.java         # UPI-based payment implementation
├── CardPayment.java        # Card-based payment implementation
├── NetBankingPayment.java  # Net banking payment implementation
└── Main.java               # Demo entry point
```


## Getting Started

### Prerequisites
- Java installed
- Terminal/Command prompt access

### Running the Application

To run the application, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP.git
    ```

2. **Navigate into the cloned directory:**
    ```bash
    cd PaymentFeatureWithOOP
    ```

3. **Compile all Java files:**
    ```bash
    javac -d . *.java
    ```

4. **Run the application:**
    ```bash
    java TG_Tasks.PaymentFeatureWithOOP.Main
    ```

Make sure you have the necessary prerequisites installed before running the application.



## OOP Principles Used

### 1. Encapsulation
Hiding internal data and exposing controlled operations.

- `Account` encapsulates the `balance` field
- Balance modifications only through `credit()` and `debit()` methods

**Implementation:** [`Account.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/Account.java)

---

### 2. Abstraction
Using a Java interface to define contracts without implementation details.

- `PaymentMethod` defines *what* a payment should do
- Concrete classes implement *how* payments are performed

**Implementation:** [`PaymentMethod.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/PaymentMethod.java)

---

### 3. Inheritance
Interface-based inheritance through `implements` keyword.

- Payment classes inherit behavioral contracts from `PaymentMethod`
- Promotes code reusability and consistent interfaces

**Implementation:**
- [`UPIPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/UPIPayment.java)
- [`CardPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/CardPayment.java)
- [`NetBankingPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/NetBankingPayment.java)

---

### 4. Polymorphism
Runtime method resolution through interface inheritance.

- Different payment types implement the same interface
- Runtime determines which `pay()` method executes

**Implementation:**
- [`UPIPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/UPIPayment.java)
- [`CardPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/CardPayment.java)
- [`NetBankingPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/NetBankingPayment.java)


**Example:**
```java
PaymentMethod payment = new UPIPayment(account);
payment.pay(1000);
```


