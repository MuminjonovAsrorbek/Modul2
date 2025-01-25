package OOP.Lesson3.Homework.HardHomework.Example2;

public class AirConditionerControl implements RemoveControl{
    private boolean isOn = false;
    private int battery;
    private int temp = 24;

    public AirConditionerControl(int battery) {
        this.battery = battery;
    }

    public void setTemperature(int temperature){
        if(isOn){
            this.temp = temperature;
            System.out.println("Temperature set to: " + temperature + "°C");
        }
        else System.out.println("Air Conditioner is off. Turn it on first to set the temperature.");
    }

    @Override
    public void turnOn() {
        if(battery > 0){
            isOn = true;
            battery = batteryLevel(5);
            System.out.println("Air Conditioner is now ON. Battery: " + battery + "%");
        }
        else System.out.println("Battery is dead! Please recharge or replace.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        battery = batteryLevel(7);
        System.out.println("Air Conditioner is now OFF. Battery: " + battery + "%");
    }

    @Override
    public void checkStatus() {
        System.out.println("Air Conditioner is " + (isOn ? "ON" : "OFF") + ". Temperature: " + temp + "°C");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
