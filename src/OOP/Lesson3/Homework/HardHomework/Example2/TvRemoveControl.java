package OOP.Lesson3.Homework.HardHomework.Example2;

public class TvRemoveControl implements RemoveControl{
    private boolean isOn = false;
    private int battery ;
    private int channel = 1;

    public TvRemoveControl(int battery) {
        this.battery = battery;
    }

    public void setChannel(int num){
        if(isOn){
            this.channel = num;
            System.out.println("Channel set to : " + channel);
        }
        else {
            System.out.println("Tv is OFF , Turn it on first set the channel");
        }
    }
    @Override
    public void turnOn() {
        if(battery > 0){
            isOn = true;
            battery = batteryLevel(5);
            System.out.println("Tv is ON , Battery : " + battery + "%");
        }
        else {
            System.out.println("Battery is dead! Please recharge or replace");
        }
    }

    @Override
    public void turnOff() {
        isOn = false;
        battery = batteryLevel(3);
        System.out.println("Tv is OFF , Battery : " + battery + "%");
    }

    @Override
    public void checkStatus() {
        System.out.println("Tv is " + (isOn ? "ON" : "OFF") + " . Current Channel : " + channel);
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }


}
