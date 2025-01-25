package OOP.Lesson3.Homework.HardHomework.Example1;

public class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("The cat eats fish.");
    }

    @Override
    void sound() {
        System.out.println("The cat says meow.");
    }

    @Override
    void move() {
        System.out.println("The cat moves gracefully.");
    }

    @Override
    void habitat() {
        System.out.println("The cat lives in houses or urban areas.");
    }

    @Override
    void lifespan() {
        System.out.println("The average lifespan for a pet cat is probably around 13 to 14 years.");
    }

    public void uniqueAbility() {
        System.out.println("One remarkable adaptation is their exceptional agility and balance. House cats possess a highly flexible skeletal structure, allowing them to navigate narrow spaces, climb trees and land gracefully on their feet, thanks to their remarkable righting reflex.");
    }
}
