package InsuranceManagementSystem;

import Account.*;
import Address.*;
import InsuranceManagementSystem.Input.Input;
import Insurance.*;
import InsuranceManagementSystem.InvalidAuthenticationException.InvalidAuthenticationException;


public class Main {

    public static void main(String[] args) throws InvalidAuthenticationException {
        run();

    }

    public static void run() throws InvalidAuthenticationException {

        while(true){
            System.out.println("Sigorta Yönetim Sistemine Hoşgeldiniz!\n1:Giriş yap\n2:Hesap oluştur\n3:Çıkış");
            int select=Input.nextInt(1,4);
            if(select==1){
                AccountManager.logIn();
                accountMenu(AccountManager.getLogInAccount());
            }else if (select==2) {
                AccountManager.createAccount();
            }else{
                break;
            }
        }
    }

    public static void accountMenu(Account account){
        while(true){
            System.out.println("Hesap Menüsü\n1:Sigorta Poliçe işlemleri\n2:Adress işlemleri\n3:Hesap bilgileri görüntüle\n4:Çıkış");
            int select=Input.nextInt(1,5);
            if(select==1){
                insuranceMenu(account);
            }else if(select==2){
                addressMenu();
            }else if(select==3){
                account.showInfo();
            }else{
                break;
            }
        }

    }

    public static void insuranceMenu(Account account){
        while(true){
            System.out.println("Sigorta Poliçe İşlemleri\n1:Sigorta Poliçeleri Görüntüle\n2:Poliçe ekle\n3:Çıkış yap");
            int select=Input.nextInt(1,4);
            if(select==1){
                InsuranceManager.printInsurance(account);
            }else if(select==2){
                InsuranceManager.addInsurance(account);
            }else{
                break;
            }
        }
    }

    public static void addressMenu(){
        while(true){
            System.out.println("Adres İşlemleri\n1:Addresleri görüntüle\n2:Adres ekle\n3:Çıkış");
            int select=Input.nextInt(1,4);
            if(select==1){
                AddressManager.printAdresses(User.getAddressList());
            }else if(select==2){
                AddressManager.addAddress(User.getAddressList());
            }else{
                break;
            }
        }
    }

}