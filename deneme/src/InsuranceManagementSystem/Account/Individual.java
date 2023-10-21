package InsuranceManagementSystem.Account;

public class Individual extends Account{
    private static final double rate=1.2;
    public Individual(User user) {
        super(user,rate);
    }
}
