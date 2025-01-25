package OOP.Lesson7.Homework.Example1;

public class StudentServiceImplement implements StudentService {
    Student[] students = new Student[]{};
    @Override
    public void add(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = student;
        students = newStudents;
        System.out.println("Student added!");
        display();
    }

    @Override
    public void display() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void deleteById(int id) {
        int index = isHave(id);
        if(index != -1){
            Student[] newStudents = new Student[students.length - 1];
            for (int i = 0, j = 0; i < students.length; i++) {
                if(i != index) newStudents[j++] = students[i];
            }
            students = newStudents;
            System.out.println("Student deleted!");
            display();
        } else {
            System.err.println("Student not found!");
        }

    }

    private int isHave(int id){
        for(int i = 0; i < students.length; i++){
            if(students[i].getStudentID() == id) return i;
        }
        return -1;
    }
}
