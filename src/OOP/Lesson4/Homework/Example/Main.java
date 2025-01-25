package OOP.Lesson4.Homework.Example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount first = new BankAccount("Asrorbek Muminjonov" , new BigDecimal(1555554682), "99635");
        BankAccount second = new BankAccount("John Snow" , new BigDecimal(0),"111101");
        BankServiceImplement bankServiceImplement = new BankServiceImplement(2);
        bankServiceImplement.added(first);
        bankServiceImplement.added(second);
        bankServiceImplement.transfer(first.getCustomerID(),"111101",new BigDecimal(554682));
        System.out.println();
        bankServiceImplement.showInfo();
    }
}
