package OOP.Lesson1.Homework.Example1;

public class iPhone14 extends iPhone{
    public iPhone14() {
    }

    public iPhone14(String model, String nomi, int yil, String spu, boolean isTypeC, int yom, String iosVersion, String battery) {
        super(model, nomi, yil, spu, isTypeC, yom, iosVersion, battery);
    }

    public iPhone14(boolean isTypeC, int yom, String iosVersion, String battery) {
        super(isTypeC, yom, iosVersion, battery);
    }


}
