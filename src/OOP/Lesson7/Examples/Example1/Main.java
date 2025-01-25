package OOP.Lesson7.Examples.Example1;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carBuilder.carModel(CarModel.SUV).carColor(CarColor.RED).transmissionType(TransmissionType.AUTOMATIC).engineType(EngineType.GASOLINE).fuelType(FuelType.PETROL).yearOfProduction(2024).mileage(0).price(100000);

        Car car = carBuilder.build();
        System.out.println(car);

        Car.CarBuilder carBuilder1 = new Car.CarBuilder();
        carBuilder1.carModel(CarModel.SEDAN).carColor(CarColor.BLACK).transmissionType(TransmissionType.MANUAL).engineType(EngineType.DIESEL).fuelType(FuelType.HYBRID);
        Car car1 = carBuilder1.build();
        System.out.println(car1);
    }
}
