package InsuranceManagementSystem.Address;


public class BusinessAddress implements Address {
    private final String name;
    private final String address;
    public BusinessAddress(String name,String address) {
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
