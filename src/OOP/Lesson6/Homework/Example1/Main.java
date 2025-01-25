package OOP.Lesson6.Homework.Example1;

public class Main{
    public static void main(String[] args) {
        Order order = new Order("Laptop" , 10000,120);
        System.out.println(order.accountTotalPrice());
    }
}
