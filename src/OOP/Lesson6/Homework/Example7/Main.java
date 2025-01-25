package OOP.Lesson6.Homework.Example7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alibek" , "ali@gmail.com");
        Invoice invoice = new Invoice(1,customer,125.5);
        System.out.println(invoice.toString());
    }
}
