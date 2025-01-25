package OOP.Lesson5.Homework.Example;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeServiceImplement = new EmployeeServiceImplement(10);
        employeeServiceImplement.filterByAge(30);
        System.out.println("-----------------------------------------------------------------------------------------");
        employeeServiceImplement.filterByGender("Female");
        System.out.println("-----------------------------------------------------------------------------------------");
        employeeServiceImplement.display();
    }
}
