package OOP.Lesson7.Homework.Example3;

public class Main {
    public static void main(String[] args) {
        Months[] months = Season.getMonths(Season.AUTUMN);
        for(Months month : months){
            System.out.println(month);
        }
    }
}
