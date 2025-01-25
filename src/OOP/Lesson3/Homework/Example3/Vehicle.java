package OOP.Lesson3.Homework.Example3;

public abstract class Vehicle {
    private String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    protected abstract void startEngine(int capacity);
    protected abstract void stopEngine();

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
