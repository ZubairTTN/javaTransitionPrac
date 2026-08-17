package interfaces;

public class Cow implements Animal{
    @Override
    public void eat() {
        System.out.println("Cow is Eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is Sleeping...");
    }

    @Override
    public void run() // here we have overridden the default method of the interface.
    {
        System.out.println("Cow is running...");
    }
}
