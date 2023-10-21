package InsuranceManagementSystem.Account;

import InsuranceManagementSystem.Address.Address;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private  String name;
    private  String surname;
    private static String email;
    private static String password;
    private  String occupation;
    private  int age;
    private static ArrayList<Address> addressList=new ArrayList<>();
    private  static Date lastLoginDate;


    public User(String name, String surname, String email, String password, String occupation, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        this.addressList = addressList;
    }

    public static ArrayList<Address> getAddressList() {
        return addressList;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "--------------------Account Information--------------------" +
                "\nİsim: " + name +
                "\nSoyisim: " + surname +
                "\nE-Mail: " + email +
                "\n:Meslek: " + occupation +
                "\nYaş: " + age +
                "\nSon Giriş Tarihi: " + getLastLoginDate() +
                "\n-----------------------------------------------------------";
    }

    public static void setLastLoginDate(Date date) {
        lastLoginDate=date;
    }

    public static Date getLastLoginDate() {
        return lastLoginDate;
    }
}

