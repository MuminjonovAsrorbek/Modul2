package OOP.Lesson6.Homework.Example6;

public non-sealed class Bus extends TransportManagement {
    public Bus(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void getDetails() {
        System.out.println("Bus is speed : " + super.getSpeed());
        System.out.println("Bus is max capacity : " + super.getCapacity());
        System.out.println();
    }
}
