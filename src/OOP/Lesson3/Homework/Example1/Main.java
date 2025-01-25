package OOP.Lesson3.Homework.Example1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.sound();

        Animal dog = new Dog();
        dog.eat();
        dog.sound();

        Animal cow = new Cow();
        cow.eat();
        cow.sound();
    }
}
