package OOP.Lesson6.Homework.Example3;

public abstract sealed class Operation permits Addition , Subtraction , Multiplication , Requirements {
    private int first;
    private int second;

    public Operation(int first, int second) {
        this.first = first;
        this.second = second;
    }

    abstract void execute();

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
