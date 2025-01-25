package OOP.Lesson2.DuringLesson.isRelations;

public class Student extends Person{
    private String classNumber;

    public Student(Person person , String classNumber) {
        super(person.getFirstName(),person.getSecondName() , person.getAge());
        this.classNumber = classNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Sinf raqami : " + getClassNumber());
    }
}
