package OOP.Lesson7.Homework.Example1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Asrorbek",WeekDay.getWeekDay(),Gender.MALE,20);
        var studentImp = new StudentServiceImplement();
        studentImp.add(student);
        studentImp.add(new Student(2,"Avazbek",WeekDay.getWeekDay(),Gender.MALE,20));
        studentImp.add(new Student(3,"Din",WeekDay.getNoWeekDay(),Gender.FEMALE,24));
        studentImp.deleteById(2);
        studentImp.deleteById(5);
    }
}
