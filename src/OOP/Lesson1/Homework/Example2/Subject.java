package OOP.Lesson1.Homework.Example2;

public class Subject{
    private String nomi;
    private int classNumber;

    public Subject(String nomi, int classNumber) {
        this.nomi = nomi;
        this.classNumber = classNumber;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
