package OOP.Lesson6.Homework.Example6;

public non-sealed class Bike extends TransportManagement{
    public Bike(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void getDetails() {
        System.out.println("Bike is speed : " + super.getSpeed());
        System.out.println("Bike is max capacity : " + super.getCapacity());
        System.out.println();
    }
}
