package OOP.Lesson3.DuringLesson.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Rectangle(4,5);
        System.out.println(shape1.perimeter());
        Shape shape2 = new Circle(2.5);
        System.out.println(shape2.perimeter());
    }
}
