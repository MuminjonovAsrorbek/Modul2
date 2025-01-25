package OOP.Lesson1.Homework.Example1;

public class iPhone15 extends iPhone{
    public iPhone15() {
    }

    public iPhone15(String model, String nomi, int yil, String spu, boolean isTypeC, int yom, String iosVersion, String battery) {
        super(model, nomi, yil, spu, isTypeC, yom, iosVersion, battery);
    }

    public iPhone15(boolean isTypeC, int yom, String iosVersion, String battery) {
        super(isTypeC, yom, iosVersion, battery);
    }


}
