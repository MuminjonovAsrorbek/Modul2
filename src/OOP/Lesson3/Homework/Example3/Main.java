package OOP.Lesson3.Homework.Example3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Nexia 2" , 60);
        Vehicle truck = new Truck("Mersedes" , 150);
        Vehicle bicycle = new Bicycle("T2" , 40);

        car.startEngine(70);
        System.out.println();
        truck.startEngine(100);
        truck.stopEngine();
    }
}
