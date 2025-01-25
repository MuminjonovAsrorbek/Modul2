package OOP.Lesson2.Homework.Example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        Employee employee = new Employee("Asrorbek" , "Java Developer" , 1000);
        System.out.println(employee.calculateSalary(5000));
        System.out.println(employee.calculateSalary(1000,50));
    }
}
