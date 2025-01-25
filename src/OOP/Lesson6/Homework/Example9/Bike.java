package OOP.Lesson6.Homework.Example9;

public non-sealed class Bike extends Transport {
    @Override
    void fuelType(String fuelType) {
        System.out.println("The bike fuel type is : " + fuelType);
    }

    @Override
    void terrainType(String terrainType) {
        System.out.println("The bike terraionType : " + terrainType);
    }
}
