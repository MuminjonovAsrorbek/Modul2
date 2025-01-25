package OOP.Lesson7.Homework.Example4;

public enum Month {
    JANUARY("YANVAR"),
    FEBRUARY("FEVRAL"),
    MARCH("MART"),
    APRIL("APREL"),
    MAY("MAY"),
    JUNE("IYUN"),
    JULY("IYUL"),
    AUGUST("AVGUST"),
    SEPTEMBER("SENTIYABR"),
    OCTOBER("OKTYABR"),
    NOVEMBER("NOYABIR"),
    DECEMBER("DEKABR");

    private String nameUz;
    private String season;

    Month(String nameUz) {
        this.nameUz = nameUz;
    }

    public void setNameUz(String nameUz) {
        this.nameUz = nameUz;
    }

}
