package OOP.Lesson7.Homework.Example3;

public enum Months {
    JANUARY("YANVAR"),
    FEBRUARY("FEVRAL"),
    MARCH("MART"),
    APRIL("APREL"),
    MAY("MAY"),
    JUNE("IYUN"),
    JULY("IYUL"),
    AUGUST("AVGUST"),
    SEPTEMBER("SENTIYABR"),
    OCTOBER("OKTIYABR"),
    NOVEMBER("NOYABIR"),
    DECEMBER("DEKABIR");

    private String nameUz;

    Months(String nameUz) {
        this.nameUz = nameUz;
    }

    static Months[] getMonths() {
        Months[] months = new Months[12];
        for (int i = 0; i < 12; i++) {
            months[i] = Months.values()[i];
        }
        return months;
    }


}
