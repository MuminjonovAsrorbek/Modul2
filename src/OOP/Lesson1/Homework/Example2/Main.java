package OOP.Lesson1.Homework.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        Phone phone = new Phone("Samsung" , "250GB" , "RED");

        Subject subject = new Subject("English" , 20);
        Teacher teacher = new Teacher(subject,5000000);
        Person person = new Person("Talaba" , "999006408","123456");
        Student student = new Student(person,"976541256" , "128" , phone);
        student.showInfo();
        student.changePassword(person.getPhone() , "123456" , "789");
        student.showInfo();
    }
}
