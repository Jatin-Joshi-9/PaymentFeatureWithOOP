
# Simple Payment Features Design
### Problem Statement

This project demonstrates how a simple payment feature can be designed using
Object-Oriented Programming principles.

## Objective
- Design a simple payment system using Java
- Apply core OOP principles (abstraction, encapsulation, polymorphism)
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

1. **Navigate to the project directory:**
    ```bash
    cd PaymentFeatureWithOOP
    ```

2. **Compile all Java files:**
    ```bash
    javac -d . *.java
    ```

3. **Run the application:**
    ```bash
    java TG_Tasks.PaymentFeatureWithOOP.Main
    ```



    ## OOP Principles Used in This Project

    ### 1. Encapsulation
    Encapsulation is achieved by **hiding internal data** and exposing only controlled operations.

    - `Account` encapsulates the `balance` field.
    - Balance cannot be modified directly from outside the class.
    - Changes are allowed only via `credit()` and `debit()` methods.

    **Where it is implemented:**
    - [`Account.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/Account.java)

    ---

    ### 2. Abstraction
    Abstraction is achieved using a **Java interface**.

    - `PaymentMethod` defines *what* a payment should do.
    - It does not define *how* the payment is performed.
    - Concrete classes provide their own implementations.

    **Where it is implemented:**
    - [`PaymentMethod.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/PaymentMethod.java)

    ---

    ### 3. Inheritance (Interface Inheritance)
    This project uses **interface-based inheritance**.

    In Java, inheritance is not limited to `extends`.  
    Classes can also inherit a **behavioral contract** using `implements`.

    - `PaymentMethod` is an interface.
    - Payment classes inherit its contract using `implements`.

    This is known as **interface inheritance**.

    **Where it is implemented:**
    - [`UPIPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/UPIPayment.java)
    - [`NetBankingPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/NetBankingPayment.java)
    - [`CreditCardPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/CreditCardPayment.java)

    ---

    ### 4. Polymorphism
    Polymorphism is achieved through **interface inheritance**.

    - Different payment types implement the same interface.
    - The same `PaymentMethod` reference can point to different implementations.
    - The correct `pay()` method is resolved at runtime.

    **Where it is implemented:**
    - [`UPIPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/UPIPayment.java)
    - [`NetBankingPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/NetBankingPayment.java)
    - [`CreditCardPayment.java`](https://github.com/Jatin-Joshi-9/PaymentFeatureWithOOP/blob/main/CreditCardPayment.java)

    ---

    Example:
    ```java
    PaymentMethod payment = new UPIPayment(account);
    payment.pay(1000);
    ```

