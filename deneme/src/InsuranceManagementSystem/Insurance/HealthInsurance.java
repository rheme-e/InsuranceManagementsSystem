package InsuranceManagementSystem.Insurance;

import Account.Account;

public class HealthInsurance extends Insurance{
    private static final double rate=1.7;
    public HealthInsurance(Account account) {
        super(account, "Sağlık Sigortası", rate);
    }

    @Override
    public void calculate() {
        super.calculate();
    }
}
