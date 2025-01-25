package OOP.Lesson6.Homework.Example10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TransactionManagement> list = new ArrayList<>();
        list.add(new TransactionManagement("1",1000,50,"WITHDRAWAL"));
        list.add(new TransactionManagement("2",100,100,"DEPOSIT"));
        System.out.println(list);
    }
}
