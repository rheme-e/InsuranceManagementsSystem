package InsuranceManagementSystem.Address;

import java.util.ArrayList;


import Account.User;
import Input.Input;

public class AddressManager {
    private static User user;
    public static void addAddress(ArrayList<Address> addresses){
        String name;
        String address;
        System.out.println("1-Ev Adresi\n2-İş Adresi\nYapmak istediğiniz eylemi seçiniz:");
        int select = Input.nextInt(1,3);
        System.out.println("Adres başlığı giriniz:");
        name=Input.nextLine();
        System.out.println("Adresi giriniz:");
        address=Input.nextLine();
        if(select == 1){
            addresses.add(new HomeAddress(name,address));
        }else if(select==2){
            addresses.add(new BusinessAddress(name,address));
        }

    }

    public static void removeAdresses(ArrayList<Address> addresses){
        printAdresses(addresses);
        System.out.println("Silmek istediğiniz adresi seçiniz:");
        int select=Input.nextInt(1,addresses.size()+1)-1;
        addresses.remove(select);
    }
    public static void printAdresses(ArrayList<Address> addresses){
        if(addresses==null || addresses.isEmpty()){
            System.out.println("Henüz adres eklenmedi.");
        }else {
            int i=1;
            System.out.println("------------------Adresler------------------");
            for(Address adress : addresses){
                System.out.println(i+":"+ adress.getName()+"    "+adress.getAddress());
                i++;
            }
            System.out.println("--------------------------------------------");
        }
    }


}
