package designPatterns.creationalDesignPatterns.builderPattern.singletonDesignPattern;

/* The Singleton Design Pattern is a design pattern that ensures:
A class has only one instance (object) throughout the application and provides a global access point to that instance. */

public class School {
    private static School school;

//    private Constructor
    private School()
    {
        System.out.println("Constructor is called"); // This constructor will be called only once
    }

    public static synchronized School getInstance()
    {
        if(school == null)
        {
            school = new School();
        }
        return school;
    }
}
