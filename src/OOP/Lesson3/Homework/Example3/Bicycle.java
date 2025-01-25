package OOP.Lesson3.Homework.Example3;

public class Bicycle extends Vehicle{
    private int oilCapacity;

    public Bicycle(String vehicleName, int oilCapacity) {
        super(vehicleName);
        this.oilCapacity = oilCapacity;
    }

    @Override
    protected void startEngine(int capacity) {
        if(oilCapacity >= capacity){
            System.out.println("Bicycle is startEngine");
        }
        else System.out.println("No battery");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Bicycle is stopEngine");
    }

    public int getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(int oilCapacity) {
        this.oilCapacity = oilCapacity;
    }
}
