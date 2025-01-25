package OOP.Lesson2.DuringLesson.hasRelations;

public class Device {
    private int deviceCapacity;
    Apps[] apps = new Apps[]{};

    public Device(int deviceCapacity) {
        this.deviceCapacity = deviceCapacity;
    }

    public Device(Apps apps) {
        this.apps = new Apps[]{apps};
    }

    public int getDeviceCapacity() {
        return deviceCapacity;
    }

    public void setDeviceCapacity(int deviceCapacity) {
        this.deviceCapacity = deviceCapacity;
    }

}
