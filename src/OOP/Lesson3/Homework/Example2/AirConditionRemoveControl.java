package OOP.Lesson3.Homework.Example2;

public class AirConditionRemoveControl implements RemoveControl{

    @Override
    public void turnOn() {
        System.out.println("AirConditionRemoveControl turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditionRemoveControl turn off");
    }
}
