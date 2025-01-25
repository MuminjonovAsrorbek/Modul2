package OOP.Lesson3.Homework.Example2;

public class CarRemoveControl implements RemoveControl{

    @Override
    public void turnOn() {
        System.out.println("CarRemoveControl turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("CarRemoveControl turn off");
    }
}
