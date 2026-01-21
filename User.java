package TG_Tasks.PaymentFeatureWithOOP;

public class User {

    private String userId;
    private String name;
    private Account account;

    public User(String userId, String name, Account account) {
        this.userId = userId;
        this.name = name;
        this.account = account;
    }
    

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
