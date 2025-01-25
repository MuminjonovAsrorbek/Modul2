package OOP.Lesson5.Homework.Example;

import java.util.Random;

public class EmployeeServiceImplement implements EmployeeService{
    public Employee[] employees;
    private final int capacity;

    public EmployeeServiceImplement(int capacity) {
        this.capacity = capacity;
        employees = new Employee[capacity];
        randomAdd();
    }

    public void randomAdd(){
        String[] genders = {"Male" , "Female"};
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            int ranAge = 18 + random.nextInt(43);
            int gen = random.nextInt(genders.length);
            employees[i] = new Employee(i + 1 , "FirstName " + (i + 1) , "LastName " + (i + 1) ,ranAge,genders[gen]);
        }
    }

    @Override
    public void display() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void filterByAge(int age) {
        boolean bool = true;
        for (Employee employee : employees) {
            if (age == employee.getAge()) {
                System.out.println(employee);
                bool = false;
            }
        }
        if(bool) System.out.println("Siz kiritgan yosh bo'yicha ma'lumot topilmadi !");
    }

    @Override
    public void filterByGender(String gender) {
        boolean bool = true;
        for (Employee employee : employees) {
            if (gender.equals(employee.getGender())) {
                System.out.println(employee);
                bool = false;
            }
        }
        if(bool) System.out.println("Siz kiritgan gender bo'yicha ma'lumot topilmadi !");
    }

}
