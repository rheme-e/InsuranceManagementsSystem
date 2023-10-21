package InsuranceManagementSystem.Insurance;
import Account.Account;


import java.util.Date;

public abstract class Insurance {
    Account account;
    private String name;
    private double cost;
    private Date endDate;
    private Date startDate;
    private double rate;

    public Insurance(Account account,String name,Double rate) {
        this.name = name;
        this.account=account;
        this.rate=rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculate() {

    }
}
