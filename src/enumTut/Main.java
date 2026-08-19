package enumTut;

public class Main {
    public static void main(String[] args) {
        System.out.println(WeekDays.MONDAY);
        System.out.println(WeekDays.TUESDAY);
        System.out.println(WeekDays.WEDNESDAY);
        System.out.println(Days.MONDAY);

        Days friday = Days.FRIDAY; // this is complete syntax
        System.out.println(friday.name().toLowerCase());
        Days isHavingDay = Days.valueOf("SATURDAY");  /* here in this line, the variable enumDay will have the Value SATURDAY only when any of the value in the list of enums defined in class DayClassEnums matches the valueOf("") data here in this syntax else will throw error like in the below try catch example */

        Days monday = Days.MONDAY;
        monday.display();
        System.out.println();

        for(Days day : Days.values())
        {
            System.out.println(day);
        }


    }
}
