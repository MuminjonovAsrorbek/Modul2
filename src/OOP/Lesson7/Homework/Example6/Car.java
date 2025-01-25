package OOP.Lesson7.Homework.Example6;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int price;
    private FueldTypeEnum fuelType;
    private boolean run;

    public Car(String brand, String model, int year, int price, FueldTypeEnum fuelType, boolean run) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
        this.run = run;
    }

    public Car() {}

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private int price;
        private FueldTypeEnum fuelType;
        private boolean run;

        public Car build() {
            return new Car(brand, model, year, price, fuelType, run);
        }

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder year(int year){
            this.year = year;
            return this;
        }

        public CarBuilder price(int price){
            this.price = price;
            return this;
        }

        public CarBuilder fuelType(FueldTypeEnum fuelType){
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder run(boolean run){
            this.run = run;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", fuelType=" + fuelType +
                ", run=" + run +
                '}';
    }

}
