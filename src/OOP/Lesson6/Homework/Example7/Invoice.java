package OOP.Lesson6.Homework.Example7;

public record Invoice(int id , Customer customer , double amount ) {
    public Invoice {

    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
