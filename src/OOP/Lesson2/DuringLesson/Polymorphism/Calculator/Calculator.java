package OOP.Lesson2.DuringLesson.Polymorphism.Calculator;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int a, int b, int c){
        return sum(a,b) + c;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int multiply(int a, int b, int c){
        return multiply(a,b) * c;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int sub(int a , int b, double c){
        return (int)(sub(a,b) - c);
    }

    public int div(int a , int b){
        return a / b;
    }

    public int div(int a, int b, double c){
        return (int) (div(a,b) / c);
    }
}
