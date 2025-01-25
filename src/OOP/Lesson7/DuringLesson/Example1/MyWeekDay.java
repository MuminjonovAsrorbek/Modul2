package OOP.Lesson7.DuringLesson.Example1;

public enum MyWeekDay {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean workDay;
    MyWeekDay(boolean workDay) {
        this.workDay = workDay;
    }

    public static MyWeekDay[] workDayArray = new MyWeekDay[5];
    public static MyWeekDay[] noWorkDay = new MyWeekDay[2];

    public static MyWeekDay[] workDay(){
        for(MyWeekDay day : MyWeekDay.values()){
            if(day.workDay){
                workDayArray[day.ordinal()] = day;
            }
            else {
                noWorkDay[day.ordinal()] = day;
            }
        }
        return workDayArray;
    }

    public static MyWeekDay[] getWorkDayArray() {
        return workDayArray;
    }


    public static MyWeekDay[] getNoWorkDay() {
        return noWorkDay;
    }

    public boolean isWorkDay() {
        return workDay;
    }

    public void setWorkDay(boolean workDay) {
        this.workDay = workDay;
    }
}
