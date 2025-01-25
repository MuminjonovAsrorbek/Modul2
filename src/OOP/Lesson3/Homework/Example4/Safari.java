package OOP.Lesson3.Homework.Example4;

public class Safari implements Browser{

    @Override
    public void open(String name) {
        System.out.println(name + " opening");
    }

    @Override
    public void close(String name) {
        System.out.println(name + " closing");
    }
}
