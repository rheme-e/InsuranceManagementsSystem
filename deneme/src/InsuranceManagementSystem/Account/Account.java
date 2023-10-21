package InsuranceManagementSystem.Account;

import InsuranceManagementSystem.Insurance.Insurance;

import java.util.ArrayList;

public abstract class Account {
    private final double rate;
    private final User user;
    private final ArrayList<Insurance> insurances;

    protected Account(User user,double rate) {
        this.user = user;
        this.rate = rate;
        this.insurances=new ArrayList<>();
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }
    public void showInfo() {
        System.out.println(user.toString());
    }
}
