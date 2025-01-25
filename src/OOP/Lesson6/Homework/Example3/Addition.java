package OOP.Lesson6.Homework.Example3;

public non-sealed class Addition extends Operation{

    public Addition(int first, int second) {
        super(first, second);
    }

    @Override
    void execute() {
        System.out.println("Addition solution : " + (super.getFirst() + super.getSecond()));
    }
}
