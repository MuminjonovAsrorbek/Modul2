package OOP.Lesson6.Homework.Example8;

public class TaskManager {
    static {
        System.out.println("The program is running");
    }

    {
        System.out.println("Foydalnuvchi ma'lumotlarini kiriting : ");
    }

    private String name;
    private int id;

    public TaskManager(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
