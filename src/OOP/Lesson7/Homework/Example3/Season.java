package OOP.Lesson7.Homework.Example3;

import java.util.Arrays;

public enum Season {
    WINTER("QISH"),
    SPRING("BAHOR"),
    SUMMER("YOZ"),
    AUTUMN("KUZ");

    private String nameUz;
    private static Months[] months;

    Season(String nameUz) {
        this.nameUz = nameUz;
    }

    static Months[] getMonths(Season season) {
        months = Months.getMonths();
        Months[] result = new Months[3];
        int index = 0;
        switch (season) {
            case Season.WINTER:
                result[index++] = Months.DECEMBER;
                result[index++] = Months.JANUARY;
                result[index++] = Months.FEBRUARY;
                break;
            case Season.SPRING:
                result[index++] = Months.MARCH;
                result[index++] = Months.APRIL;
                result[index++] = Months.MAY;
                break;
            case Season.SUMMER:
                result[index++] = Months.JUNE;
                result[index++] = Months.JULY;
                result[index++] = Months.AUGUST;
                break;
            case Season.AUTUMN:
                result[index++] = Months.SEPTEMBER;
                result[index++] = Months.OCTOBER;
                result[index++] = Months.NOVEMBER;
                break;
        }
        return result;
    }

    public void setNameUz(String nameUz) {
        this.nameUz = nameUz;
    }

    public void setMonths(Months[] months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "Season{" +
                "nameUz='" + nameUz + '\'' +
                ", months=" + Arrays.toString(months) +
                '}';
    }
}
