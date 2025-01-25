package OOP.Lesson3.Homework.Example2;

public class TvRemoveControl implements RemoveControl{

    @Override
    public void turnOn() {
        System.out.println("TvRemoveControl turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("TvRemoveControl turn off");
    }
}
