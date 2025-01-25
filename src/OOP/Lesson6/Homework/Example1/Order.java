package OOP.Lesson6.Homework.Example1;

public record Order(String productName, int quantity, double pricePerUnit) {
    static {
        System.out.println("By @Mr_Tarmoq");
    }

    public Order {

    }

    public double accountTotalPrice() {
        return quantity * pricePerUnit;
    }
}
