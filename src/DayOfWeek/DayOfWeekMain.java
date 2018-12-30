package DayOfWeek;

public class DayOfWeekMain {
    public enum DayOfWeek {
        MONDAY, TUESDAY, WESNESDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    public static int getWorkingHours(DayOfWeek day){
        int hours = 0;

        hours = (day.ordinal()+1)*8;

        return hours;
    }
}
