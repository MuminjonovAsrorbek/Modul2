package OOP.Lesson3.Homework.HardHomework.Example1;

public class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("The dog eats meat.");
    }

    @Override
    void sound() {
        System.out.println("The dog barks.");
    }

    @Override
    void move() {
        System.out.println("The dog runs around playfully.");
    }

    @Override
    void habitat() {
        System.out.println("The dog lives in homes or outdoors.");
    }

    @Override
    void lifespan() {
        System.out.println("The average lifespan for dogs is between 10–13 years");
    }

    public void uniqueAbility(){
        System.out.println("First of all, they can see in the dark—about five times better than we can. Perhaps even more surprising is that dogs have a much larger field of vision. While humans can see just beyond the 180 degree view in front of us, dogs can see up to 270 degrees around themselves.");
    }
}
