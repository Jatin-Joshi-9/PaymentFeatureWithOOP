package TG_Tasks.PaymentFeatureWithOOP;

public class CreditCardPayment implements PaymentMethod {

    private double creditLimit;

    public CreditCardPayment(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0 || amount > creditLimit) {
            return false;
        }
        creditLimit -= amount;
        return true;
    }
}
