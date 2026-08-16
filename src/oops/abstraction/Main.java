package oops.abstraction;

/* Abstraction means showing only essential details and hiding implementation. It can be achieved using abstract classes or interfaces.
* Benefit: Hides complexity and improves security.*/

abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    @Override
    public void start()
    {
        System.out.println("Car Starts with a Key..");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}

/* A java file can have multiple main methods in different classes */
//class Test{
//    public static void main(String[] args) {
//        System.out.println("Hello!...");
//    }
//}
