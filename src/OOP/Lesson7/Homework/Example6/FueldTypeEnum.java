package OOP.Lesson7.Homework.Example6;

public enum FueldTypeEnum {
    GASOLINE("BENZIN"),
    DIESEL("DIZEL"),
    ELECTRIC("ELEKTR"),
    HYBRID("GIBRID");

    private String nameUz;

    FueldTypeEnum(String nameUz) {
        this.nameUz = nameUz;
    }

    public String getNameUz() {
        return nameUz;
    }

    public void setNameUz(String nameUz) {
        this.nameUz = nameUz;
    }
}