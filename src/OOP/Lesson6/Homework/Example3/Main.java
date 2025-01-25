package OOP.Lesson6.Homework.Example3;

public class Main {
    public static void main(String[] args) {
        Operation first = new Multiplication(4,5);
        first.execute();
        Operation second = new Addition(3,7);
        second.execute();
        Operation three = new Subtraction(45,40);
        three.execute();
        Operation fourth = new Requirements(4,5);
        fourth.execute();
    }
}
