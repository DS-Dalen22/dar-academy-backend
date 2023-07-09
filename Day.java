package basics;

public class Day {
    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay() {
            return !(this == SATURDAY || this == SUNDAY);
        }

        public boolean isHoliday() {
            return !isWeekDay();
        }
    }

    public static void main(String[] args) {
        for (Weekday day : Weekday.values()) {
            printDayType(day);
        }
    }

    public static void printDayType(Weekday day) {
        if (day.isHoliday()) {
            System.out.println(day + " is a holiday.");
        } else {
            System.out.println(day + " is a weekday.");
        }
    }
}

