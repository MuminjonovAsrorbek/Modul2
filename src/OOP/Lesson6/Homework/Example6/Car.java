package OOP.Lesson6.Homework.Example6;

public non-sealed class Car extends TransportManagement {
    public Car(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void getDetails() {
        System.out.println("Car is speed : " + super.getSpeed());
        System.out.println("Car is max capacity : " + super.getCapacity());
        System.out.println();
    }
}
