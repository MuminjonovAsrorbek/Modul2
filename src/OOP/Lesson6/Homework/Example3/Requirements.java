package OOP.Lesson6.Homework.Example3;

public non-sealed class Requirements extends Operation{

    public Requirements(int first, int second) {
        super(first, second);
    }

    @Override
    void execute() {
        System.out.println("first number : " + super.getFirst());
        System.out.println("second number : " + super.getSecond());
    }
}
