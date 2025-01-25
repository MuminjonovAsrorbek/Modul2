package OOP.Lesson4.DuringLesson;

public class Main {
    public static void main(String[] args) {

    }
    public static long factorial(int num){
        long sum = 1;
        for(int i = 1; i <= num; i++){
            sum = (int)(sum * i % (Math.pow(10,9) + 7));
        }
        return sum;
    }
}
