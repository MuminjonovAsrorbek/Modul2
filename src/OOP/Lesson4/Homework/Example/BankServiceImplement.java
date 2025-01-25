package OOP.Lesson4.Homework.Example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class BankServiceImplement implements BankService{
    private int number;
    public BankAccount[] bankAccounts;

    public BankServiceImplement(int number) {
        this.number = number;
        bankAccounts = new BankAccount[number];
        randomAdd();
    }

    @Override
    public void transfer(String fromCustomerId, String toCustomerId, BigDecimal amount) {
        int index = isHaveAndReturnID(String.valueOf(fromCustomerId));
        if(isHaveAndReturnID(String.valueOf(fromCustomerId)) != -1 && isHaveAndReturnID(String.valueOf(toCustomerId)) != -1){
            if(bankAccounts[index].getBalance().compareTo(amount) < 0)
                System.out.println("Xisobingizda mablag' yetarli emas !");
            else {
                int num = isHaveAndReturnID(String.valueOf(toCustomerId));
                bankAccounts[num].setBalance(bankAccounts[num].getBalance().add(amount));
                bankAccounts[index].setBalance(bankAccounts[index].getBalance().subtract(amount));
                System.out.println("Summa :" + amount + " o'tkazildi ");
            }
        }

        else System.out.println("Siz kiritigan customerId lar tizimda mavjud emas");
    }

    private int isHaveAndReturnID(String customerId){
        for(int i = 0; i < bankAccounts.length; i++){
            if(bankAccounts[i].getCustomerID().equals(customerId)){
                return i;
            }
        }
        return -1;
    }

    public void added(BankAccount bankAccount){
        BankAccount[] bankAccounts1 = new BankAccount[bankAccounts.length + 1];
        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts1[i] = bankAccounts[i];
        }
        bankAccounts1[bankAccounts.length] = bankAccount;
        bankAccounts = bankAccounts1;
    }

    public void randomAdd(){
        String[] firstNames = {"Ali", "Bek", "Avazbek", "Olim", "Nodir", "Jasur", "Dilshod", "Saidjon", "Yusuf", "Jasurbek"};
        String[] lastNames = {"Nazarov", "Karimov", "Alimov", "Soliev", "Rasulov", "Jumaboev", "Yuldashev", "Mamatov", "Mirsidiqov", "Qo'chqorov"};
        Random random = new Random();
        for(int i = 0; i < number; i++){
            String fullName = firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
            BigDecimal bigDecimal = BigDecimal.valueOf(100 + (100 - 10) * random.nextInt());
            int customerId = 10000 + random.nextInt(90000);

            bankAccounts[i] = new BankAccount(fullName,bigDecimal,String.valueOf(customerId));
        }
    }

    public void showInfo(){
        System.out.println(Arrays.toString(bankAccounts));
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
