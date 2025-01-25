package OOP.Lesson6.Homework.Example6;

public abstract sealed class TransportManagement permits Car , Bike , Bus {
    private int speed;
    private int capacity;

    public TransportManagement(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    abstract void getDetails();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
