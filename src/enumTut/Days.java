package enumTut;

/* In Java, enums (enumerations) are used when you need a fixed set of constant values. They make code more readable, type-safe, and easier to maintain than using strings or integers. */

/* here SUNDAY, MONDAY etc are instances of the Days class  */
public enum Days {
    MONDAY, TUESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    void display()
    {
        System.out.println("today is: " + this.name());
    }
}
