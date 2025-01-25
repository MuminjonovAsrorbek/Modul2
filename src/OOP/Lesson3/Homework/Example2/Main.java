package OOP.Lesson3.Homework.Example2;

public class Main {
    public static void main(String[] args) {
        RemoveControl tvRemoveControl = new TvRemoveControl();
        tvRemoveControl.turnOn();
        tvRemoveControl.turnOff();
        System.out.println();

        RemoveControl carRemoveControl = new CarRemoveControl();
        carRemoveControl.turnOn();
        carRemoveControl.turnOff();
        System.out.println();

        RemoveControl airConditionRemoveControl = new AirConditionRemoveControl();
        airConditionRemoveControl.turnOn();
        airConditionRemoveControl.turnOff();
    }
}
