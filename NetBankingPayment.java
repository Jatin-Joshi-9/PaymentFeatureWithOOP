package TG_Tasks.PaymentFeatureWithOOP;

public class NetBankingPayment implements PaymentMethod {

    private Account account;

    public NetBankingPayment(Account account) {
        this.account = account;
    }

    @Override
    public boolean pay(double amount) {
        return account.debit(amount);
    }
}

