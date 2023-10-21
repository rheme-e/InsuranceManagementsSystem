package InsuranceManagementSystem.Account;

public class Enterprise extends Account{
    private static final double rate=2.1;
    public Enterprise(User user) {
        super(user, rate);
    }
}
