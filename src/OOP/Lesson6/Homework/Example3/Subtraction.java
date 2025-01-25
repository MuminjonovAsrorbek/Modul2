package OOP.Lesson6.Homework.Example3;

public non-sealed class Subtraction extends Operation{
    public Subtraction(int first, int second) {
        super(first, second);
    }

    @Override
    void execute() {
        System.out.println("Subtraction solution : " + (super.getFirst() - super.getSecond()));
    }
}
