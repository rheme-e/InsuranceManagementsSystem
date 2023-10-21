package InsuranceManagementSystem.Address;

public class HomeAddress implements Address {
    private final String name;
    private final String address;
    public HomeAddress(String name,String address) {
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
