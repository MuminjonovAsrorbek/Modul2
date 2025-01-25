package OOP.Lesson3.Homework.Example1;

public class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("Cat is eating!");
    }

    @Override
    void sound() {
        System.out.println("Cat sound is : meow");
    }
}
