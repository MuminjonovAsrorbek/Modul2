package OOP.Lesson7.Homework.Example1;

import java.util.Arrays;

public class Student {
    private int studentID;
    private String name;
    private WeekDay[] weekDays ;
    private Gender gender;
    private int age;

    public Student(int studentID, String name, WeekDay[] weekDays, Gender gender, int age) {
        this.studentID = studentID;
        this.name = name;
        this.weekDays = weekDays;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", weekDays=" + Arrays.toString(weekDays) +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
