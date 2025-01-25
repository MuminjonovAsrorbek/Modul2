package OOP.Lesson1.Homework.Example2;

public class Teacher extends Person{
    private final Subject subject;
    private double salary;
    private Phone phone;

    public Teacher(Subject subject, double salary) {
        this.subject = subject;
        this.salary = salary;
    }


    public Subject getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
