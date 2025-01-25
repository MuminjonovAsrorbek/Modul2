package OOP.Lesson7.Homework.Example1;

public enum WeekDay {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    private boolean workday;

    WeekDay(boolean workday) {
        this.workday = workday;
    }

    public static WeekDay[] getWeekDay() {
        WeekDay[] weekDays = WeekDay.values();
        int count = 0;
        for (WeekDay weekDay : weekDays) {
            if (weekDay.workday) {
                count++;
            }
        }
        WeekDay[] newWeekDays = new WeekDay[count];
        count = 0;
        for(WeekDay weekDay : weekDays) {
            if (weekDay.workday) {
                newWeekDays[count++] = weekDay;
            }
        }
        return newWeekDays;
    }

    public static WeekDay[] getNoWeekDay() {
        WeekDay[] weekDays = WeekDay.values();
        int count = 0;
        for (WeekDay weekDay : weekDays) {
            if (weekDay.workday) {
                count++;
            }
        }
        WeekDay[] newWeekDays = new WeekDay[count];
        count = 0;
        for(WeekDay weekDay : weekDays) {
            if (weekDay.workday) {
                newWeekDays[count++] = weekDay;
            }
        }
        return newWeekDays;
    }



    public boolean isWorkday() {
        return workday;
    }

    public void setWorkday(boolean workday) {
        this.workday = workday;
    }

}
