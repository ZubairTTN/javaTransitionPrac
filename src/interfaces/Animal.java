package interfaces;
/* An interface is a blueprint for class, that defines what a class will have/do

* An interface class will only have:
* 1. Abstract methods
* 2. Static Constants
3. Static methods - has body
4. Default Methods - has body
*
Use Of Interface:
1. To achieve multiple inheritance
2. To achieve Abstraction */

/* Class → extends → Class
Class -> extends -> Abstract Class
Class → implements → Interface
Interface → extends → Interface */

/*Interface member	   Implicit modifiers
Abstract method	   -    public abstract
Variable/constant  -    public static final

Note: An Abstract class can have a constructor but an interface cannot have a constructor*/

public interface Animal {
    public static final int MAX_AGE = 100;
    public abstract void eat();
    void sleep();

    public static void info() // implementing class cannot override an interface's static method.
    {
        System.out.println("this is a static method in interface. ");
    }

    public default void run() // default methods need not to be overriden (overriding is not necessary) by the implemented class and if required implementing class can also override it
    {
        this.eat(); // as the default method runs on instances/ objects we can call other methods using this keyword
        System.out.println("Animal is running...");
    }

    public static void main(String[] args) {
        System.out.println("This is main method inside interface and it is valid as main method is a static method");
    }
}

//class Dog implements Animal{
//
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void sleep() {
//
//    }
//}
