package oops.polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound()
    {
        System.out.println("Meoowwww....");
    }

    public void eat()
    {
        System.out.println("Cat is Eating..");
    }
}
