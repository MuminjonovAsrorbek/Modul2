package OOP.Lesson6.Homework.Example9;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bike = new Bike();
        Transport bus = new Bus();
        car.fuelType("AI105");
        car.terrainType("the road does not choose");
        System.out.println();
        bike.fuelType("Energy");
        bike.terrainType("the road does not choose");
        System.out.println();
        bus.fuelType("AI80");
        bus.terrainType("On a flat road");
    }
}
