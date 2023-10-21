package InsuranceManagementSystem.Insurance;

import Account.Account;

public class CarInsurance extends Insurance{
    private static final double rate=2.5;
    public CarInsurance(Account account) {
        super(account, "Araba Sigortası", rate);
    }

    @Override
    public void calculate() {
        super.calculate();
    }
}
