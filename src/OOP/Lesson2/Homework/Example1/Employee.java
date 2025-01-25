package OOP.Lesson2.Homework.Example1;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public double calculateSalary(double basicSalary){
        return basicSalary + salary;
    }

    public double calculateSalary(double basicSalary , double bonus){
        return calculateSalary(basicSalary) + bonus;
    }

    public double calculateSalary(double basicSalary , double bonus , double deduction){
        return calculateSalary(basicSalary,bonus) - deduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
