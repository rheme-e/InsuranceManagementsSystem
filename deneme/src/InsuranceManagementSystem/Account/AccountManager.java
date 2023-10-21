package InsuranceManagementSystem.Account;

import InsuranceManagementSystem.InvalidAuthenticationException.InvalidAuthenticationException;
import java.util.Date;
import java.util.ArrayList;
import Input.*;


public class AccountManager {

    private static final ArrayList<Account> accounts = new ArrayList<Account>();
    private AuthenticationStatus loginStatus;
    private static Account logInAccount=null;

    public static void logIn() throws InvalidAuthenticationException {

            System.out.println("Mail adresinizi giriniz:");
            String email = Input.nextLine();
            System.out.println("Parolanızı giriniz:");
            String password = Input.nextLine();
            if (User.getEmail().equals(email) && User.getPassword().equals(password)) {
                System.out.println("Başarı ile giriş yapıldı!");
                AuthenticationStatus loginStatus = AuthenticationStatus.SUCCESS;
                loggedIn(email,password);
            } else {
                throw new InvalidAuthenticationException();
            }


    }


    public static boolean loggedIn(String email, String password) {
        for (Account account : accounts) {
            if (User.getEmail().equals(email)) {
                if (User.getPassword().equals(password)) {
                    logInAccount = account;
                    User.setLastLoginDate(new Date());
                    return true;
                }
            }
        }
        return false;
    }

    public static void createAccount() {
        String name;
        String surName;
        String email;
        String password;
        String password2;
        String job;
        int age;
        createAccountLabel:
        while (true) {
            System.out.println("Hesap Tipi:\n1:Bireysel\n2:Kurumsal");
            int select = Input.nextInt(1, 3);
            System.out.println("İsminizi giriniz:");
            name = Input.nextLine();
            System.out.println("Soyisminizi giriniz:");
            surName = Input.nextLine();
            System.out.println("Mail adresinizi giriniz:");
            email = Input.nextLine();
            for (Account accounts : accounts) {
                if (User.getEmail().equals(email)) {
                    System.out.println("Mail adresi sistemimizde zaten kayıtlı!");
                    continue createAccountLabel;
                }
            }
            while(true){
                System.out.println("Yeni şifrenizi giriniz:");
                password = Input.nextLine();
                System.out.println("Yeni şifrenizi tekrar giriniz:");
                password2 = Input.nextLine();
                if (!password.equals(password2)) {
                    System.out.println("Şifreler uyuyşmuyor tekrar giriniz:");
                } else{
                    break;
                }
            }

            System.out.println("Mesleğinizi giriniz:");
            job = Input.nextLine();
            System.out.println("Yaşınızı giriniz:");
            age = Input.nextInt();

            if (select == 1) {
                accounts.add(new Individual(new User(name, surName, email, password, job, age)));
            } else if (select == 2) {
                accounts.add(new Enterprise(new User(name, surName, email, password, job, age)));
            }
            System.out.println("Hesabınız başarı ile oluşturuldu!");
            break;
        }
    }


    public enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }

    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public static Account getLogInAccount() {
        return logInAccount;
    }
}
