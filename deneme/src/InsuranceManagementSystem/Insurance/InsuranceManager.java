package InsuranceManagementSystem.Insurance;
import Address.Address;
import Input.Input;
import Account.Account;

public class InsuranceManager {
    public static void addInsurance(Account account){
        System.out.println("1-Araba Sigortası\n2-Seyehat Sigortası\n3-Sağlık Sigortası\n4-Konut Sigortası");
        int select=Input.nextInt(1,5);
        if(select==1){
            account.getInsurances().add(new CarInsurance(account));
            System.out.println("Araba poliçesi başarı ile eklendi");
        }else if(select==2){
            account.getInsurances().add(new TravelInsurance(account));
            System.out.println("Seyehat poliçesi başarı ile eklendi");
        }else if(select==3){
            account.getInsurances().add(new HealthInsurance(account));
            System.out.println("Sağlık poliçesi başarı ile eklendi");
        }else if(select==4){
            account.getInsurances().add(new ResidenceInsurance(account));
            System.out.println("Konut poliçesi başarı ile eklendi");
        }

    }
    public static void printInsurance(Account account){
        if(account.getInsurances().isEmpty() || account.getInsurances() == null){
            System.out.println("Henüz poliçe eklenmedi!");
        }else{
            int i=1;
            System.out.println("------------------Adresler------------------");
            for(Insurance insurance : account.getInsurances()){
                System.out.println(i+":"+ insurance.getName()+" Oranı: "+insurance.getRate());
                i++;
            }
            System.out.println("--------------------------------------------");
        }

    }

}
