package collectionFrameworks.setTut;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Day> workingDays = EnumSet.of(Day.MONDAY,
                Day.TUESDAY,
                Day.WEDNESDAY,
                Day.THURSDAY,
                Day.FRIDAY);
        System.out.println(workingDays);

//        Create all enum values:
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(allDays);

//        We Can Create empty enum set
        EnumSet<Day> days = EnumSet.noneOf(Day.class);
        days.add(Day.MONDAY);
        days.add(Day.FRIDAY);
        System.out.println(days);
    }
}
