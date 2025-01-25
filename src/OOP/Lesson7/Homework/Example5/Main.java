package OOP.Lesson7.Homework.Example5;

public class Main {
    public static void main(String[] args) {
        var builder = new Employee.Builder();
        builder.firstName("Asrorbek").lastName("Muminjonov").age(20).department("Coder");
        Employee employee = builder.build();
        System.out.println(employee);
        var builder1 = new Employee.Builder();
        builder1.firstName("John").lastName("Doe").age(22).department("Dentist");
        Employee employee1 = builder1.build();
        System.out.println(employee1);
    }
}
