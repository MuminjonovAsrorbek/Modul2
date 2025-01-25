package OOP.Lesson6.Homework.Example4;

public record Ticket(int id , String type , double price) {
    public Ticket {
        if("VIP".equals(type) && price < 50){
            System.out.println("VIP tickets must have a price of at least $50.");
        } else if("PREMIUM".equals(type) && price < 100){
            System.out.println("PREMIUM tickets must have a price of at least $100.");
        }
    }
}
