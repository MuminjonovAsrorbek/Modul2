package OOP.Lesson3.Homework.Example1;

public class Cow extends Animal{

    @Override
    void eat() {
        System.out.println("Cow is eating");
    }

    @Override
    void sound() {
        System.out.println("Cow sound is : moo");
    }
}
