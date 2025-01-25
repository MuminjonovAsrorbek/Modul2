package OOP.Lesson1.Homework.Example2;

public class Student extends Person{
    private String parentNumber;
    private String schoolNumber;
    private Phone phone;

    public Student(Person person , String parentNumber, String schoolNumber, Phone phone1) {
        super(person.getNomi(),person.getPhone(),person.getPassword());
        this.parentNumber = parentNumber;
        this.schoolNumber = schoolNumber;
        this.phone = phone1;
    }


    public void call(String number){
        System.out.println("Calling " + number + " from " + phone.getNomi());
    }

}
