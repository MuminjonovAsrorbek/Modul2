package OOP.Lesson3.Homework.HardHomework.Example2;

public class CarRemoveControl implements RemoveControl{
    private boolean isLocked = true;
    private int battery;

    public CarRemoveControl(int battery) {
        this.battery = battery;
    }

    public void luck(){
        isLocked = true;
        System.out.println("Car is locked");
    }

    public void unLock(){
        isLocked = false;
        System.out.println("Car is unLocked");
    }

    @Override
    public void turnOn() {
        if(battery > 0){
            battery = batteryLevel(3);
            System.out.println("Car is now started . Battery: " + battery + "%");
        }
        else{
            System.out.println("Battery is dead! Please recharge or replace.");
        }
    }

    @Override
    public void turnOff() {
        battery = batteryLevel(1);
        System.out.println("Car is now off");
    }

    @Override
    public void checkStatus() {
        System.out.println("Car is " + (isLocked ? "Locked" : "Unlocked") + " .");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
