package OOP.Lesson2.Homework.Example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        AnimalSounds animalSounds = new AnimalSounds("Dog", 12,"vovv");
        animalSounds.add("Cat", 4,"meow");
//        animalSounds.makeSound();
        animalSounds.makeSound("meow");
    }
}
