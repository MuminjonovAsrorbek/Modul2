package OOP.Lesson1.Homework.Example1;

public class Redmi extends Phone{
    private String androidVersion;
    private String battery;
    private boolean isPen;

    public Redmi(){}

    public Redmi(String model, String nomi, int yil, String spu, String androidVersion, String battery, boolean isPen) {
        super(model, nomi, yil, spu);
        this.androidVersion = androidVersion;
        this.battery = battery;
        this.isPen = isPen;
    }

    public Redmi(String androidVersion, String battery, boolean isPen) {
        this.androidVersion = androidVersion;
        this.battery = battery;
        this.isPen = isPen;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public boolean isPen() {
        return isPen;
    }

    public void setPen(boolean pen) {
        isPen = pen;
    }

    void showInfo(){
        System.out.println();
        System.out.println("Telefon rusumi : " + super.getModel());
        System.out.println("Telefon nomi : " + super.getNomi());
        System.out.println("Ishlab chiqarilgan yili : " + super.getYil());
        System.out.println("Protsessor nomi : " + super.getSpu());
        System.out.println("Android versiaysi : " + androidVersion);
        System.out.println("Batareya hajmi : " + battery);
        System.out.println("Elektron ruchkasi bormi : " + isPen);
        System.out.println();
        System.out.println("---------------------------------------------");
    }
}
