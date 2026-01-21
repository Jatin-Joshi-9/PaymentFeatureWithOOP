package TG_Tasks.PaymentFeatureWithOOP;

public class UPIPayment implements PaymentMethod {

    private Account account;

    public UPIPayment(Account account) {
        this.account = account;
    }

    @Override
    public boolean pay(double amount) {
        return account.debit(amount);
    }
}
