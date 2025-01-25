package OOP.Lesson6.Homework.Example9;

public abstract sealed class Transport permits Car , Bike , Bus {
    abstract void fuelType(String fuelType);
    abstract void terrainType(String terrainType);
}
