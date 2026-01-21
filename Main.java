package TG_Tasks.PaymentFeatureWithOOP;
public class Main {

    public static void main(String[] args) {

        // 1. Create an account with initial balance
        Account account = new Account(5000);

        // 2. Assign account to a user
        User user = new User("U101", "Jatin", account);

        // 3. Create payment methods
        PaymentMethod upiPayment = new UPIPayment(user.getAccount());
        PaymentMethod netBankingPayment = new NetBankingPayment(user.getAccount());
        PaymentMethod creditCardPayment = new CreditCardPayment(3000);

        // 4. Perform payments
        System.out.println("Initial Balance: " + user.getAccount().getBalance());

        boolean upiResult = upiPayment.pay(1000);
        System.out.println("UPI Payment of 1000: " + upiResult);
        System.out.println("Balance after UPI: " + user.getAccount().getBalance());

        boolean netBankingResult = netBankingPayment.pay(2000);
        System.out.println("NetBanking Payment of 2000: " + netBankingResult);
        System.out.println("Balance after NetBanking: " + user.getAccount().getBalance());

        boolean creditCardResult = creditCardPayment.pay(2500);
        System.out.println("Credit Card Payment of 2500: " + creditCardResult);

        boolean creditCardFail = creditCardPayment.pay(1000);
        System.out.println("Credit Card Payment of 1000 (should fail): " + creditCardFail);
    }
}
