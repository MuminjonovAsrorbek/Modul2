package OOP.Lesson6.Homework.Example3;

public non-sealed class Multiplication extends Operation{

    public Multiplication(int first, int second) {
        super(first, second);
    }

    @Override
    void execute() {
        System.out.println("Multiplication solution : " + (super.getFirst() * super.getSecond()));
    }
}
