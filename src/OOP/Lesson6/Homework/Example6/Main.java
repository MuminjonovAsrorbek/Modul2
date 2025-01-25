package OOP.Lesson6.Homework.Example6;

public class Main {
    public static void main(String[] args) {
        TransportManagement car = new Car(180,6);
        TransportManagement bike = new Bike(45,2);
        TransportManagement bus = new Bus(90 , 25);
        car.getDetails();
        bike.getDetails();
        bus.getDetails();
    }
}
