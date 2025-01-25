package OOP.Lesson6.Homework.Example9;

public non-sealed class Bus extends Transport {
    @Override
    void fuelType(String fuelType) {
        System.out.println("The Bus fuel type is : " + fuelType);
    }

    @Override
    void terrainType(String terrainType) {
        System.out.println("The Bus terrain type is : " + terrainType);
    }
}
