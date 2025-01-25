package OOP.Lesson2.DuringLesson.Polymorphism.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sub(10, 15));
        System.out.println(calculator.sub(10, 15, 20));
    }
}
