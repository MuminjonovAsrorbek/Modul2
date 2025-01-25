package OOP.Lesson2.Homework.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(4,3);
        System.out.println(rectangle.area());
        System.out.println(rectangle.area(5,4));
        System.out.println(rectangle.area(5));
    }
}
