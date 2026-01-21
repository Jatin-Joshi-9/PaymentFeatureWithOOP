
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


