package oops.inheritance.multiple;

public class Dog implements Animal, Pet{
    @Override
    public void eat()
    {
        System.out.println("Dog is eating. ");
    }

    @Override
    public void play()
    {
        System.out.println("Dog is Playing");
    }
}
