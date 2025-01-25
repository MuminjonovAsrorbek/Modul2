package OOP.Lesson1.Homework.Example2;

public class Phone {
    private String nomi;
    private String storage;
    private String color;

    public Phone(String nomi, String storage, String color) {
        this.nomi = nomi;
        this.storage = storage;
        this.color = color;
    }

    public String getNomi() {
        return nomi;
    }

    public String getStorage() {
        return storage;
    }

    public String getColor() {
        return color;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
