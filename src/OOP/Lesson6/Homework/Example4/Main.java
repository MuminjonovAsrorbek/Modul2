package OOP.Lesson6.Homework.Example4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, "REGULAR", 40));
        tickets.add(new Ticket(2, "VIP", 60));
        tickets.add(new Ticket(3, "PREMIUM", 120));
        tickets.add(new Ticket(4, "REGULAR", 80));
        tickets.add(new Ticket(5, "VIP", 30));
        tickets.add(new Ticket(6, "PREMIUM", 95));

        System.out.println("Narxi $70 dan yuqori biletlar :");
        for(Ticket ticket : tickets){
            if(ticket.price() > 70){
                System.out.println(ticket);
            }
        }
    }
}
