package OOP.Lesson3.Homework.HardHomework.Example2;

public class Main {
    public static void main(String[] args) {
        RemoveControl tvRemoveControl = new TvRemoveControl(10);
        RemoveControl carRemoveControl = new CarRemoveControl(5);
        RemoveControl airConditionControl = new AirConditionerControl(10);

        System.out.println("------/TvRemoteControl/--------");
        tvRemoveControl.turnOn();
        ((TvRemoveControl) tvRemoveControl).setChannel(5);
        tvRemoveControl.checkStatus();
        tvRemoveControl.turnOff();

        System.out.println("------/CarRemoteControl/--------");
        carRemoveControl.turnOn();
        ((CarRemoveControl) carRemoveControl).luck();
        carRemoveControl.checkStatus();
        carRemoveControl.turnOff();
    }
}
