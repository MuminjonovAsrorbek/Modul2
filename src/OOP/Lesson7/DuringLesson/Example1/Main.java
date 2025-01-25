package OOP.Lesson7.DuringLesson.Example1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Work days");
        for (MyWeekDay myWeekDay : MyWeekDay.workDayArray) {
            System.out.println(myWeekDay);
        }
        System.out.println("Not work days");
        for(MyWeekDay myWeekDay : MyWeekDay.noWorkDay){
            System.out.println(myWeekDay);
        }
    }
}
