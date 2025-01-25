package OOP.Lesson7.Examples.Example1;

public class Car {
    private CarModel carModel;
    private CarColor carColor;
    private TransmissionType transmissionType;
    private EngineType engineType;
    private FuelType fuelType;
    private int yearOfProduction;
    private int mileage;
    private int price;

    public Car(CarModel carModel, CarColor carColor, TransmissionType transmissionType, EngineType engineType, FuelType fuelType, int yearOfProduction, int mileage, int price) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.transmissionType = transmissionType;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.mileage = mileage;
        this.price = price;
    }

    public Car() {
    }
    public static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", carColor=" + carColor +
                ", transmissionType=" + transmissionType +
                ", engineType=" + engineType +
                ", fuelType=" + fuelType +
                ", yearOfProduction=" + yearOfProduction +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    public static class CarBuilder {
        private CarModel carModel;
        private CarColor carColor;
        private TransmissionType transmissionType;
        private EngineType engineType;
        private FuelType fuelType;
        private int yearOfProduction;
        private int mileage;
        private int price;

        public Car build() {
            return new Car(carModel, carColor, transmissionType, engineType, fuelType, yearOfProduction, mileage, price);
        }

        public CarBuilder carModel(CarModel carModel) {
            this.carModel = carModel;
            return this;
        }

        public CarBuilder carColor(CarColor carColor) {
            this.carColor = carColor;
            return this;
        }

        public CarBuilder transmissionType(TransmissionType transmissionType) {
            this.transmissionType = transmissionType;
            return this;
        }

        public CarBuilder engineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder fuelType(FuelType fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder yearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public CarBuilder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder price(int price) {
            this.price = price;
            return this;
        }

    }
}
