package OOP.Lesson6.Homework.Example7;

public record Customer(String name , String email) {
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
