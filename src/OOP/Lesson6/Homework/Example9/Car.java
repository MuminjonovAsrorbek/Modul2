package OOP.Lesson6.Homework.Example9;

public non-sealed class Car extends Transport {
    @Override
    void fuelType(String fuelType) {
        System.out.println("The car fuel type is : " + fuelType);
    }

    @Override
    void terrainType(String terrainType) {
        System.out.println("The Car terrain type is : " + terrainType);
    }
}
