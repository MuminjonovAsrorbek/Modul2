package OOP.Lesson7.Homework.Example6;

public class Main {
    public static void main(String[] args) {
        var first = new Car.CarBuilder();
        first.brand("BMW").model("X7").year(2024).price(1000000000).fuelType(FueldTypeEnum.GASOLINE).run(true);
        Car car = first.build();
        System.out.println(car);

        var second = new Car.CarBuilder();
        second.brand("Mersedes Benz").model("E-Class").year(2024).price(1000000007).fuelType(FueldTypeEnum.DIESEL).run(true);
        Car car2 = second.build();
        System.out.println(car2);

    }
}