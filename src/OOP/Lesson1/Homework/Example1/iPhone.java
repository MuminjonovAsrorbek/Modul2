package OOP.Lesson1.Homework.Example1;

public class iPhone extends Phone{
    private boolean isTypeC;
    private int yom;
    private String iosVersion;
    private String battery;

    public iPhone(){}

    public iPhone(String model, String nomi, int yil, String spu, boolean isTypeC, int yom, String iosVersion, String battery) {
        super(model, nomi, yil, spu);
        this.isTypeC = isTypeC;
        this.yom = yom;
        this.iosVersion = iosVersion;
        this.battery = battery;
    }

    public iPhone(boolean isTypeC, int yom, String iosVersion, String battery) {
        this.isTypeC = isTypeC;
        this.yom = yom;
        this.iosVersion = iosVersion;
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public boolean isTypeC() {
        return isTypeC;
    }

    public void setTypeC(boolean typeC) {
        isTypeC = typeC;
    }

    public int getYom() {
        return yom;
    }

    public void setYom(int yom) {
        this.yom = yom;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    void showInfo(){
        System.out.println();
        System.out.println("Telefon rusumi : " + super.getModel());
        System.out.println("Telefon nomi : " + super.getNomi());
        System.out.println("Ishlab chiqarilgan yili : " + super.getYil());
        System.out.println("Protsessor nomi : " + super.getSpu());
        System.out.println("TypeC ni qo'llab quvvatlaydimi (true / false) : " + isTypeC());
        System.out.println("Yomkust : " + getYom());
        System.out.println("IOS versiyasi : " + getIosVersion());
        System.out.println("Batteriya hajmi : " + getBattery());
        System.out.println("Kamera MP : " + getCamera());
        System.out.println();
        System.out.println("---------------------------------------------");
    }
}
