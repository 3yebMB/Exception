package DayOfWeek;

public class DayOfWeekMain {
    public enum DayOfWeek {
        MONDAY, TUESDAY, WESNESDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
    }

    public static String getWorkingHours(DayOfWeek day){
        int hours = 40;

        switch (day.ordinal()){
            case 0 :
                hours = 40;
                break;
            case 1 :
                hours = 32;
                break;
            case 2 :
                hours = 24;
                break;
            case 3 :
                hours = 16;
                break;
            case 4 :
                hours = 8;
                break;
            case 5 :
                hours = 0;
                break;
            case 6 :
                hours = 0;
                break;
        };

        if (hours != 0)
            return "До конца недели осталось " + hours + " ч.";
        else
            return "Расслабься, сегодня выходной";
    }
}
