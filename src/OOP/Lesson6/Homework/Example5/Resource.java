package OOP.Lesson6.Homework.Example5;

public class Resource {
    {
        System.out.println("Resource initialized ....");
    }

    private String name;

    public Resource(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
