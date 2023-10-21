package InsuranceManagementSystem.Insurance;

import Account.Account;

public class TravelInsurance extends Insurance{
    private static final double rate=1.2;
    public TravelInsurance(Account account) {
        super(account, "Seyehat Sigortası", rate);
    }

    @Override
    public void calculate() {
        super.calculate();
    }
}
