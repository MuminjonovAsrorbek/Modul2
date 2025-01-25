package OOP.Lesson3.Homework.Example3;

public class Truck extends Vehicle{
    private int oilCapacity;

    public Truck(String vehicleName, int oilCapacity) {
        super(vehicleName);
        this.oilCapacity = oilCapacity;
    }

    @Override
    protected void startEngine(int capacity) {
        if(oilCapacity >= capacity){
            System.out.println("Truck is startEngine");
        }
        else System.out.println("No oil");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Car is stopEngine");
    }

    public int getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(int oilCapacity) {
        this.oilCapacity = oilCapacity;
    }
}
