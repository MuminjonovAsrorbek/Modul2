package OOP.Lesson2.DuringLesson.isRelations;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Asrorbek" , "Muminjonov" , 20);
        Student student = new Student(person,"10-A");
        student.showInfo();
    }
}
