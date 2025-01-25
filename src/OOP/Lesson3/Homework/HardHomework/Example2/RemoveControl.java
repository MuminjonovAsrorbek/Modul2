package OOP.Lesson3.Homework.HardHomework.Example2;

public interface RemoveControl {
    void turnOn();
    void turnOff();
    void checkStatus();

    default int batteryLevel(int level){
        int battery  = 100;
        battery -= level;
        if(battery <= 20){
            System.out.println("Warning : Battery is low !");
        }
        return Math.max(battery,0);
    }
}
