package InsuranceManagementSystem.Insurance;

import Account.Account;

public class ResidenceInsurance extends Insurance{
    private static final double rate=3.5;
    public ResidenceInsurance(Account account) {
        super(account, "Konut Sigortası", rate);
    }

    @Override
    public void calculate() {
        super.calculate();
    }
}
