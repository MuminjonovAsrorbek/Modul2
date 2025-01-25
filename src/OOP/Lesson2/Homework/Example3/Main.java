package OOP.Lesson2.Homework.Example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        Shape shape = new Shape("Kavdrat");
        System.out.println(shape.perimeter(5));
        Shape shape1 = new Shape("To'rtburchak");
        System.out.println(shape1.perimeter(3,4));
        Shape shape2 = new Shape("Aylana");
        System.out.println(shape2.perimeter(3.6));
    }
}
